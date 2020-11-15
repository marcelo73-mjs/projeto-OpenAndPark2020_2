
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.contratos.IEstacionaVaga;
import fja.edu.br.dominio.entidades.EstacionaVaga;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EstacionaVagaRepositorio extends DaoUtil implements IEstacionaVaga{

    public EstacionaVagaRepositorio() {
    }
    

    @Override
    public boolean incluir(EstacionaVaga estacionaVaga) {
       String sql="INSERT INTO estacioVaga(fk_idEstacionamento, fk_idVaga, vagas_livres)Values(?,?,?)";       
       PreparedStatement ps;
       int ret =-1;
            

        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1, estacionaVaga.getEstacionamento().getIdestacionamento());
            ps.setInt(2, estacionaVaga.getVaga().getIdvaga());
            ps.setBoolean(3,estacionaVaga.isVagaslivres());
            
            ret=ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
             
       return ret>0;
    }

    @Override
    public boolean editar(EstacionaVaga estacionaVaga) {
       String sql="UPDATE FROM estacioVaga(fk_idEstacionamento=?, fk_idVaga=?, vagas_livres=?)"
               + "WHERE id_estacionaVaga(?)";
       int ret=-1;
       
       PreparedStatement ps;
        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1, estacionaVaga.getEstacionamento().getIdestacionamento());
            ps.setInt(2, estacionaVaga.getVaga().getIdvaga());
            ps.setBoolean(3,estacionaVaga.isVagaslivres());
            ps.setInt(4, estacionaVaga.getIdestacionavaga());
            
            ret=ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return ret>0;
    }

    @Override
    public boolean deletarPorId(int idestacionavaga) {
         String sql="DELETE FROM estacioVaga WHERE id_estacionaVaga(?)";
      int ret =-1;
       
       PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, idestacionavaga);
            ret=ps.executeUpdate();
            ps.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return ret>0;
    }

    @Override
    public EstacionaVaga getConsultaPorId(int idestacionavaga) {
        String sql="SELECT id_estacionaVaga, fk_idEstacionamento, fk_idVaga, vagas_livres"
                + " WHERE id_estacionaVaga(?)";
        EstacionaVaga  estaVaga = new EstacionaVaga();
        EstacionamentoRepositorio estaRepositorio = new  EstacionamentoRepositorio();
        VagaRepositorio vagaRepositorio= new   VagaRepositorio();
        int ret =-1;
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs;
            rs= ps.executeQuery();
            
            while(rs.next()){
                 estaVaga = new EstacionaVaga(    rs.getInt("id_estacionaVaga"),
                 estaRepositorio.getConsultaPorId(rs.getInt("fk_idEstacionamento")),
                 vagaRepositorio.getConsultaPorId(rs.getInt("fk_idVaga")),
                                                  rs.getBoolean("vagas_livres")
                        
                
                );
            }
            ps.close();
            rs.close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return estaVaga;
        
    }

    @Override
    public List<EstacionaVaga> getlistaTodosOsEstacionamentosEVagas() {
         
        List<EstacionaVaga> listaEstacionaVaga = new LinkedList();
        
        String sql="SELECT id_estacionaVaga, fk_idEstacionamento, fk_idVaga, vagas_livres"
                + " FROM estacionaVaga";
        EstacionaVaga  estaVaga = new EstacionaVaga();
        EstacionamentoRepositorio estaRepositorio = new  EstacionamentoRepositorio();
        VagaRepositorio vagaRepositorio= new   VagaRepositorio();
        int ret =-1;
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs;
            rs= ps.executeQuery();
            
            while(rs.next()){
                listaEstacionaVaga.add (new EstacionaVaga(    rs.getInt("id_estacionaVaga"),
                 estaRepositorio.getConsultaPorId(rs.getInt("fk_idEstacionamento")),
                 vagaRepositorio.getConsultaPorId(rs.getInt("fk_idVaga")),
                                                  rs.getBoolean("vagas_livres")
                        
                
                ));
            }
            
            ps.close();
            rs.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstacionaVagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaEstacionaVaga;
        
    }


}
