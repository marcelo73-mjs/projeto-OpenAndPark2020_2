
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

    public EstacionamentoRepositorio() {
        super();
    }
    

    @Override
    public boolean incluir(Estacionamento estacionamento) {
         String sql = "INSERT INTO estacionamento (nome,email,logradouro,numero," +
                      "bloco,bairro,CEP,cidade,UF)VALUES(?,?,?,?,?,?,?,?,?)";
         
        PreparedStatement ps;
        int ret = -1;
        
        try {
            ps=super.getPreparedStatement(sql);
           
            ps.setString(1,estacionamento.getNome_estacionamento());
            ps.setString(2, estacionamento.getEmail());
            ps.setString(3, estacionamento.getLogradouro());
            ps.setInt(4, estacionamento.getNumero());
            ps.setString(5, estacionamento.getBloco());
            ps.setString(6, estacionamento.getBairro());
            ps.setString(7, estacionamento.getCep());
            ps.setString(8, estacionamento.getCidade());
            ps.setString(9, estacionamento.getUf());
            
            ret=ps.executeUpdate();
            ps.close();
          
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
    }

    @Override
    public boolean editar(Estacionamento estacionamento) {
         String sql = "UPDATE estacionamento SET nome = ?, email = ?,logradouro = ?,numero = ?, "
                 + "bloco = ?,bairro = ?,CEP = ?,cidade = ?,UF = ? WHERE id_estacionamento = ?";
        int ret = -1;
        
        PreparedStatement ps;
        
        try {
            ps=getPreparedStatement(sql);
            ps.setString(1,estacionamento.getNome_estacionamento());
            ps.setString(2, estacionamento.getEmail());
            ps.setString(3, estacionamento.getLogradouro());
            ps.setInt(4, estacionamento.getNumero());
            ps.setString(5, estacionamento.getBloco());
            ps.setString(6, estacionamento.getBairro());
            ps.setString(7, estacionamento.getCep());
            ps.setString(8, estacionamento.getCidade());
            ps.setString(9, estacionamento.getUf());
            ps.setInt(10, estacionamento.getIdestacionamento());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
    }

    @Override
    public boolean deletarPorId(int idestacionamento) {
        String sql = "DELETE FROM estacionamento WHERE id_estacionamento =?";
        PreparedStatement ps;
        int ret = -1;   
        
        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1, idestacionamento);
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
       
    
    }

    @Override
    public Estacionamento getConsultaPorId(int idestacionamento) {
        Estacionamento est = new Estacionamento();
        String sql= "SELECT id_estacionamento,nome,email,logradouro,numero,bloco,bairro,CEP,cidade,UF "
                + "FROM estacionamento WHERE id_estacionamento=?";
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, idestacionamento);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                est = new Estacionamento (rs.getInt("id_estacionamento"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("logradouro"),
                        rs.getInt("numero"),
                        rs.getString("bloco"),
                        rs.getString("bairro"),
                        rs.getString("CEP"),
                        rs.getString("cidade"),
                        rs.getString("UF")
                     
                );
               
            }
             rs.close(); //Result do java
             ps.close(); // Prepared do banco
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
      return est; //Aqui eu so 
    }

    @Override
    public List<Estacionamento> getListaTodosEstacionamentos() {
        List<Estacionamento>listaEstacionamento = new LinkedList();
        String sql= "SELECT id_estacionamento ,nome,email,logradouro,numero,bloco,bairro,CEP,cidade,UF "
                + "FROM estacionamento";
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){ 
            
               listaEstacionamento.add(new Estacionamento  (rs.getInt("id_estacionamento"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("logradouro"),
                        rs.getInt("numero"),
                        rs.getString("bloco"),
                        rs.getString("bairro"),
                        rs.getString("CEP"),
                        rs.getString("cidade"),
                        rs.getString("UF")
                     
                ));
               
            }
             rs.close(); //Result do java
             ps.close(); // Prepared do banco
          
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
      return listaEstacionamento;  
    }
    
}
