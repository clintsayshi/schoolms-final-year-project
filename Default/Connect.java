package Default;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mcclint
 */
public class Connect {
    
    public static void main(String[] args){
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
            // Statement st = 
            System.out.println("working");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
