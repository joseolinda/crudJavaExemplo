/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Easy
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Success");            
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Driver not found" + cnfe);
        }        
        String url="jdbc:mysql://localhost:3306/wbeducar_java?useTimezone=true&serverTimezone=UTC";        
        try{
          DBConnection=DriverManager.getConnection(url,"root","");
          System.out.println("Database Connected");
        }
        catch(SQLException se){
          System.out.println("Database Not Found: " + se);  
        }
        return DBConnection;
        
 
        
        
    }
    
}
