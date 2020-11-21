
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.contratos.ILogin;
import fja.edu.br.dominio.entidades.Login;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginRepositorio extends DaoUtil implements ILogin {

   
    public LoginRepositorio() {
    }

    @Override
    public boolean incluir(Login login) {
        String sql="INSERT INTO login(usuario, senha, email)values(?,?,?)";
        int ret = -1;
        PreparedStatement ps;
       
        try {
            ps=super.getPreparedStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getSenha());
            ps.setString(3, login.getEmail());
            
            ps.close();
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret >0;
    }

    @Override
    public boolean editar(Login login) {
       String sql ="UPDATE login SET usuario=?,senha=?,email=? WHERE id_login =? ";
       int ret = -1;
       PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getSenha());
            ps.setString(3, login.getEmail());
            ret=ps.executeUpdate();
            ps.close();
        
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return ret >0;
    }

    @Override
    public boolean deletarPorId(int idlogin) {
        String sql = "DELETE FROM login WHERE id_login = ?";
        int ret = -1;
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, idlogin);
            
            ret=ps.executeUpdate();
            ps.close();
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return ret >0;
    }

    @Override
    public Login getConsultaPorId(int idlogin) {
        Login login = new Login();
        String sql ="SELECT id_login,usuario, senha,email  WHERE id_login=?";
        
        PreparedStatement ps;
        
        try {
            ps= super.getPreparedStatement(sql);
            ps.setInt(1, idlogin);
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()){
                login = new Login(
                        rs.getInt(idlogin),
                        rs.getString("usuario"),
                        rs.getString("senha"),
                        rs.getString("email")
                        
                );
            }
            
            
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return login;
    }

    @Override
    public List<Login> listaTodosLoginPorId() {
        List<Login>listaLogin = new LinkedList();
        String sql ="SELECT id_login, usuario, senha, email FROM login";
        
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            
            
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                listaLogin.add(new Login(rs.getInt("id_login"),
                        rs.getString("usuario"),
                        rs.getString("senha"),
                        rs.getString("email")
                ));
            }
            ps.close();
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        return listaLogin;
        
    }
    
}
