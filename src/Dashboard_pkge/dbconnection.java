/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dashboard_pkge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User1
 */
public class dbconnection {
    public static Connection dbconnection(){
          
        String url = "jdbc:mysql://localhost:3306/juicebar_system";
        String password = "";
        String user = "root";
        
        try {
            
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
        
        
        } catch (Exception e) {
            return null;
        }
}
}
