/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {
   

    //STEP #1
    private static final String username = "root"; 
    private static final String password = ""; 
    private static final String db_con  = "jdbc:mysql://localhost:3306/admin"; 
    
    private static  Connection conn; 
    private static  DatabaseConnection dbc; 
    

    
    public DatabaseConnection(){
       
       conn = null;
        try {
             conn = DriverManager.getConnection(db_con, username,password); 
             JOptionPane.showMessageDialog(null, "Database has been loaded successfully"); 
        } catch (Exception ex) { 
             JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public static DatabaseConnection getDBConnection(){
    if (dbc == null){
        dbc = new DatabaseConnection();
    }
    return dbc;
    }
    
    
    public  Connection getConnection(){
        return conn;
    }
    
    
}
  
