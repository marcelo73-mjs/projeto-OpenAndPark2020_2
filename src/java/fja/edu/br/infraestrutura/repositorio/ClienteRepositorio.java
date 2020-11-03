
package fja.edu.br.infraestrutura.repositorio;

import fja.edu.br.dominio.contratos.ICliente;
import fja.edu.br.dominio.entidades.Cliente;
import fja.edu.br.infraestutura.dataconnection.DaoUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteRepositorio extends DaoUtil implements ICliente{

    @Override
    public boolean incluir(Cliente cliente) {
       String sql = "INSERT INTO cliente(nome,sobrenome,CPF,email,logradouro,bairro,numero,CEP)"
               + "values(?,?,?,?,?,?,?,?)";
        int ret = 0;
        
        PreparedStatement ps;
        
        try {
            ps=super.getPreparedStatement(sql);
            ps.setString(1,cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setString(3,cliente.getCpf());
            ps.setString(4, cliente.getEmail());
            ps.setString(5, cliente.getLogradouro());
            ps.setString(6, cliente.getBairro());
            ps.setInt(7, cliente.getNumero());
            ps.setString(8, cliente.getBloco());
            ps.setString(9, cliente.getCep());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
       
    }

    @Override
    public boolean editar(Cliente cliente) {
        String sql = "UPDADTE SET cliente nome=?,sobrenome=?,CPF=?,email=?,logradouro=?,"
                + "bairro=?,numero=?,CEP=? WHERE=idCliente=? ";
      
        int ret = 0;
        
        PreparedStatement ps;
        
        try {
            ps=super.getPreparedStatement(sql);
            ps.setString(1,cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setString(3,cliente.getCpf());
            ps.setString(4, cliente.getEmail());
            ps.setString(5, cliente.getLogradouro());
            ps.setString(6, cliente.getBairro());
            ps.setInt(7, cliente.getNumero());
            ps.setString(8, cliente.getBloco());
            ps.setString(9, cliente.getCep());
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
       
    }

    @Override
    public boolean deletarPorId(int idcliente) {
        String sql = "DELETE FROM cliente(idCliente)"
               + "values(?)";
        int ret = 0;
        
        PreparedStatement ps;
        
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, idcliente);
         
            
            ret=ps.executeUpdate();
            ps.close();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ret > 0;
       
    }
    
 

    @Override
    public Cliente getConsultaPorId(int idcliente) {
        Cliente cli = new Cliente();
        String sql= "SELECT idCliente,nome,sobrenome, CPF, email,logradouro,bairro,numero,bloco,CEP FROM cliente WHERE idCliente=?";
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ps.setInt(1, idcliente);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                cli = new Cliente (rs.getInt("idCliente"),
                        rs.getString("nome"),
                        rs.getNString("sobrenome"),
                        rs.getString("CPF"),
                        rs.getString("email"),
                        rs.getString("logradouro"),
                        rs.getString("bairro"),
                        rs.getInt("numero"),
                        rs.getString("bloco"),
                        rs.getString("CEP")
                     
                );
               
            }
             rs.close(); //Result do java
             ps.close(); // Prepared do banco
          
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
      return cli; //Aqui eu so 
    }

    @Override
    public List<Cliente> getListaTodosClientes() {
        List <Cliente> clienteList = new LinkedList();
   
        String sql= "SELECT idCliente,nome,sobrenome, CPF, email,logradouro,bairro,numero,bloco,CEP FROM cliente";
        PreparedStatement ps;
        try {
            ps=super.getPreparedStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
               clienteList.add (new Cliente (rs.getInt("idCliente"),
                       rs.getString("nome"),
                        rs.getNString("sobrenome"),
                        rs.getString("CPF"),
                        rs.getString("email"),
                        rs.getString("logradouro"),
                        rs.getString("bairro"),
                        rs.getInt("numero"),
                        rs.getString("bloco"),
                        rs.getString("CEP")
                     
                ));
               
            }
             rs.close(); //Result do java
             ps.close(); // Prepared do banco
          
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
      return clienteList; //Aqui eu so 
    }
}