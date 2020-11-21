
package fja.edu.br.infraestutura.dataconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DaoUtil { //Ninguem pode instacionar, apenas herdar!
    private Connection cx = null;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        if(cx==null){
            String url ="jdbc:mysql://localhost:3306/projetoWeb?zeroDateTimeBehavior=convertToNull";
            String psw ="Adeni2308";
            String usr ="root";
            String drv ="com.mysql.jdbc.Driver";
           
           
            Class.forName(drv);
            
            cx= DriverManager.getConnection(url,usr,psw);
        }
         return cx;
      
 
    }
   
    public void getfechaConnection() throws SQLException{
        if(cx!= null){
            this.cx.close();
            this.cx=null;
        }
    }
    public Statement getStatement() throws ClassNotFoundException, SQLException{
        return this.getConnection().createStatement();
    }
    public PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        return this.getConnection().prepareStatement(sql);
        
    }
    
}
