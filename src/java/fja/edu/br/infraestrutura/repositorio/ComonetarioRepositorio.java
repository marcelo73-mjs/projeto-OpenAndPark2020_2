
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.contratos.IComentario;
import fja.edu.br.dominio.entidades.Comentario;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ComonetarioRepositorio extends DaoUtil implements IComentario{

    @Override
    public boolean incluir(Comentario comentario) {
        String sql="INSERT INTO FROM comentario(fk_id_cliente, mensagem, data_mensagem, numero_estrelas)"
                + "VALUES(?,?,?,?)";
        int ret=0;
        
        PreparedStatement ps;
        Comentario com = new Comentario();
       
        try {
            ps = super.getPreparedStatement(sql);
            ps.setInt(1, comentario.getCliente().getIdcliente());
            ps.setString(2, comentario.getMensagem());
            ps.setDate(3, new java.sql.Date (com.getDatamensagem().getTime() ));
            ps.setInt(4, comentario.getNumestrela());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ComonetarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        return ret>0;
    }

    @Override
    public boolean editar(Comentario comentario) {
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        String sql="UPDATE SET comentario(fk_id_cliente=?, mensagem=?, data_mensagem=?, numero_estrelas=?)"
                + "WHERE idComentario";
         Comentario com = new Comentario();
        int ret=0;
        
        PreparedStatement ps;
       
       
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, comentario.getCliente().getIdcliente());
            ps.setString(2, comentario.getMensagem());
            ps.setDate(3, new java.sql.Date (com.getDatamensagem().getTime() ));
            ps.setInt(4, comentario.getNumestrela());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ComonetarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
        return ret>0;
    }

    @Override
    public boolean deletarPorId(int idcomentario) {
       String sql="DELETE FROM comentario (idComentario) WHERE idComentario VALUES(?)";
        int ret=0;
        
        PreparedStatement ps;
        Comentario com = new Comentario();
       
        try {
            ps = getPreparedStatement(sql);
            ps.setInt(1, idcomentario);
          
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ComonetarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
        return ret>0;
    }

    @Override
    public Comentario getConsultaPorId(int idcomentario) {
       String sql ="SELECT FROM comentario idComentario, fk_id_cliente, mensagem, data_mensagem, numero_estrelas)"
               + "WHERE idComentario";
        Comentario com = new Comentario();
        
        PreparedStatement ps;
        
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        try {
            ps=getPreparedStatement(sql);
            ps.setInt(1, idcomentario);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                ps.setDate(3, new java.sql.Date(com.getDatamensagem().getTime()));
                com = new Comentario(
                        rs.getInt("idcomentario"),
                        clienteRepositorio.getConsultaPorId(rs.getInt("fk_id_cliente")),
                        rs.getString("mensagem"),
                        rs.getDate("data_mensagem"),
                        rs.getInt("nemero_estrelas")
                        
                        
                );
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ComonetarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return com;
    }

    @Override
    public List<Comentario> getListatodosComentarios() {
         String sql ="SELECT  idComentario, fk_id_cliente, mensagem, data_mensagem, numero_estrelas"
               + "FROM comentario";
         
        List<Comentario>comentarioLista = new LinkedList();
        Comentario com = new Comentario();
        
        PreparedStatement ps;
        
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
        try {
            ps=getPreparedStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                ps.setDate(3, new java.sql.Date(com.getDatamensagem().getTime()));
                comentarioLista.add(new Comentario(rs.getInt("idcomentario" ),
                        clienteRepositorio.getConsultaPorId(rs.getInt("fk_id_cliente") ),
                                                            rs.getString("mensagem"),
                                                            rs.getDate("data_mensagem"),
                                                            rs.getInt("nemero_estrelas")
                        
                        
                ));
            }
            ps.close();
            rs.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ComonetarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       return comentarioLista;
    }

    }
    

