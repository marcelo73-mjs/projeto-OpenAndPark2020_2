
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.contratos.ICidade;
import fja.edu.br.dominio.entidades.Cidade;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CidadeRepositorio extends DaoUtil implements ICidade{

    @Override
    public boolean incluir(Cidade cidade) {
       String sql="INSERT INTO cidade(fk_id_estacionamento, nome_cidade, UF)values(?,?,?)";
       int ret=-1;
       
       PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, cidade.getEstacionemanto().getIdestacionamento());
            ps.setString(2, cidade.getCidade());
            ps.setString(3,cidade.getUF());
            
            ret=ps.executeUpdate();
            ps.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CidadeRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
       return ret >0;
    }

    @Override
    public boolean editar(Cidade cidade) {
       String sql="UPDADE SET cidade (idCidade=?, fk_id_estacionamento=?, nome_cidade=?, UF=?)";
       int ret=-1;
       
       PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, cidade.getIdcidade());
            ps.setInt(2, cidade.getEstacionemanto().getIdestacionamento());
            ps.setString(3, cidade.getCidade());
            ps.setString(4,cidade.getUF());
            
            ret=ps.executeUpdate();
            ps.close();
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CidadeRepositorio.class.getName()).log(Level.SEVERE, null, ex);
            }

    return ret>0;
    }    
   
  @Override
    public boolean deletarPorId(int idcidade) {
        String sql="DELETE FROM estacioVaga WHERE idcidade(?)";
        int ret =-1;
       
       PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1,  idcidade);
            ret=ps.executeUpdate();
            ps.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return ret>0;
    }

    @Override
    public Cidade getConsultaPorId(int  idcidadea) {
        String sql="SELECT  idCidade, fk_id_estacionamento, nome_cidade, UF WHERE idCidade";
            
        Cidade  cidade = new Cidade();
        EstacionamentoRepositorio estaRepositorio = new EstacionamentoRepositorio();
        
        int ret =-1;
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs;
            rs= ps.executeQuery();
            
            while(rs.next()){
                cidade = new Cidade(rs.getInt("idCidade"),
                estaRepositorio.getConsultaPorId(rs.getInt("fk_id_estacionamento")),
                rs.getString("nome_cidade"),
                rs.getString("UF")
                                              
                        
                
                );
            }
            ps.close();
            rs.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cidade;
        
    }

    @Override
    public List<Cidade> getListaTodasCidades() {
         
        List<Cidade> listaCidade = new LinkedList();
        
        String sql="SELECT  idCidade, fk_id_estacionamento, nome_cidade, UF FROM cidade";
            
        Cidade  cidade = new Cidade();
        EstacionamentoRepositorio estaRepositorio = new EstacionamentoRepositorio();
        
        int ret =-1;
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs;
            rs= ps.executeQuery();
            
            while(rs.next()){
                cidade = new Cidade(rs.getInt("idCidade"),
                estaRepositorio.getConsultaPorId(rs.getInt("fk_id_estacionamento")),
                rs.getString("nome_cidade"),
                rs.getString("UF")
                                                      
                
                );
            }
            ps.close();
            rs.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaCidade;
        
        
    }

  

  

}
