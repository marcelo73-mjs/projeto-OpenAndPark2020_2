
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.entidades.Estacionamento;
import fja.edu.br.dominio.contratos.IEstacionamento;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EstacionamentoRepositorio extends DaoUtil implements IEstacionamento {

    @Override
    public boolean incluir(Estacionamento estacionamento) {
         String sql = "INSERT INTO estacionamento(nome,horario_abertura,horario_fechamento,email,logradouro,numero,bloco,bairro,CEP)"
               + "values(?,?,?,?,?,?,?,?)";
        int ret = 0;
        
        PreparedStatement ps;
        
        try {
            ps=getPreparedStatement(sql);
            ps.setString(1,estacionamento.getNome_estacionamento());
            ps.setTime(2, estacionamento.getHorarioabertura());
            ps.setTime(3,estacionamento.getHorariofechamento());
            ps.setString(4, estacionamento.getEmail());
            ps.setString(5, estacionamento.getLogradouro());
            ps.setInt(6, estacionamento.getNumero());
            ps.setString(7, estacionamento.getBloco());
            ps.setString(8, estacionamento.getBairro());
            ps.setString(9, estacionamento.getCep());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
    }

    @Override
    public boolean editar(Estacionamento estacionamento) {
         String sql = "UPDATE SET estacionamento nome=?,horario_abertura=?,horario_fechamento=?,"
                 + "email=?,logradouro=?,numero=?,bloco=?,bairro=?,CEP=?)"
                 +"WHERE idEstaciopnamento";
        int ret = 0;
        
        PreparedStatement ps;
        
        try {
            ps=getPreparedStatement(sql);
            ps.setString(1,estacionamento.getNome_estacionamento());
            ps.setTime(2, estacionamento.getHorarioabertura());
            ps.setTime(3,estacionamento.getHorariofechamento());
            ps.setString(4, estacionamento.getEmail());
            ps.setString(5, estacionamento.getLogradouro());
            ps.setInt(6, estacionamento.getNumero());
            ps.setString(7, estacionamento.getBloco());
            ps.setString(8, estacionamento.getBairro());
            ps.setString(9, estacionamento.getCep());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
    }

    @Override
    public boolean deletarPorId(int idestacionamento) {
        String sql = "DELETE FROM estacionamento(idEstacionamento)"
               + "values(?)";
        int ret = 0;
        
        PreparedStatement ps;
        
        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1, idestacionamento);
         
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
       
    
    }

    @Override
    public Estacionamento getConsultaPorId(int idestacionamento) {
        Estacionamento est = new Estacionamento();
        String sql= "SELECT id_estacionamento,nome,horario_abertura, horario_fechamento, email,logradouro,numero,bloco,bairro,CEP "
                + "FROM estacionamento WHERE idEstacionamento=?";
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, idestacionamento);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){ 
             ps.setTime(2, new java.sql.Time(est.getHorarioabertura().getTime()));
             ps.setTime(3, new java.sql.Time(est.getHorariofechamento().getTime()));
                est = new Estacionamento (rs.getInt("id_estacionamento"),
                        rs.getString("nome"),
                        rs.getTime("horario_abertura"),
                        rs.getTime("horario_fechamento"),
                        rs.getString("email"),
                        rs.getString("logradouro"),
                        rs.getInt("numero"),
                        rs.getString("bairro"),
                        rs.getString("bloco"),
                        rs.getString("CEP")
                     
                );
               
            }
             rs.close(); //Result do java
             ps.close(); // Prepared do banco
          
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
      return est; //Aqui eu so 
    }

    @Override
    public List<Estacionamento> getListaTodosEstacionamentos() {
        List<Estacionamento>listaEstacionamento = new LinkedList();
        String sql= "SELECT id_estacionamento,nome,horario_abertura, horario_fechamento, email,logradouro,numero,bloco,bairro,CEP "
                + "FROM estacionamento ";
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){ 
            
               listaEstacionamento.add(new Estacionamento  (rs.getInt("id_estacionamento"),
                        rs.getString("nome"),
                        rs.getTime("horario_abertura"),
                        rs.getTime("horario_fechamento"),
                        rs.getString("email"),
                        rs.getString("logradouro"),
                        rs.getInt("numero"),
                        rs.getString("bairro"),
                        rs.getString("bloco"),
                        rs.getString("CEP")
                     
                ));
               
            }
             rs.close(); //Result do java
             ps.close(); // Prepared do banco
          
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
      return listaEstacionamento;  
    }
    
}
