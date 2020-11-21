/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.contratos.IVaga;
import fja.edu.br.dominio.entidades.Vaga;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evawellesrodrigues
 */
public class VagaRepositorio extends DaoUtil implements IVaga{

    @Override
    public boolean incluir(Vaga vaga) {
        String sql="INSERT INTO vaga(numero,descricao)VALUES(?,?)";
        int ret = -1;
        
        PreparedStatement ps;
        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1, vaga.getNumero());
            ps.setString(2,vaga.getDescricao());
            
            ret = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret >0;
        
        
    }

    @Override
    public boolean editar(Vaga vaga) {
        String sql="UPDADE FROM vaga(numero=?, descricao=?) WHERE idVaga=?";
        
        int ret =-1;
        
        PreparedStatement ps;
        try {
            ps= getPreparedStatement(sql);
            ps.setInt(1, vaga.getNumero());
            ps.setString(2,vaga.getDescricao());
            ps.setInt(3, vaga.getIdvaga());
            
            ret = ps.executeUpdate();
            ps.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return ret>0;
    }

    @Override
    public boolean deletarPorId(int idvaga) {
       String sql="DELETE FROM vaga  WHERE idVaga";
       int ret = -1;
       
       PreparedStatement ps;
        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1,idvaga);
            
            ret=ps.executeUpdate();
            ps.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return ret >0;
    }

    @Override
    public Vaga getConsultaPorId(int idvaga) {
        
        Vaga vaga = new Vaga();
        String sql="SELECT idVaga, numero, descricao WHERE idVaga";
   
        
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs;
            rs=ps.executeQuery();
            while(rs.next()){
               vaga= new Vaga(rs.getInt("idVaga"),
                       rs.getInt("numero"),
                       rs.getString("descricao")
               );
            }
            
            rs.close();
            ps.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vaga;
        
        
    }

    @Override
    public List<Vaga> getListaTodasVagas() {
        List<Vaga> listaVaga = new LinkedList();
        String sql="SELECT idVaga, numero, descricao FROM idVaga";
   
        
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs;
            rs=ps.executeQuery();
            while(rs.next()){
             listaVaga.add(new Vaga (rs.getInt("idVaga"),
                                rs.getInt("numero"),
                                rs.getString("descricao")
               ));
            }
            
            rs.close();
            ps.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VagaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaVaga;
      
    }
    
}
