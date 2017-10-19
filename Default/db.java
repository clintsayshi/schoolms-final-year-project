package Default;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
 * @author Narayan
 * @Editor-1: SeifAllah
 * @Editor-2: Clinton
 */

public class db {

    private static Connection conn;
    private static String url = "jdbc:mysql://10.10.100.2:3306/school.db?jdbcCompliantTruncation=false&useSSL=false";
    private static String localurl = "jdbc:mysql://localhost:3306/school.db?jdbcCompliantTruncation=false&useSSL=false";
    private static String localuser = "root";
    private static String localpass = "root";
    private static String user = "trilogic";
    private static String pass = "2468";
    private static PreparedStatement ps;

    public static Connection getConnect(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(ClassNotFoundException ex){
            System.err.println("Error: "+ ex.getMessage());
        }catch(InstantiationException e){
            System.err.println("Error: "+ e.getMessage());
        }catch(IllegalAccessException x){
            System.err.println("Error: "+ x.getMessage());
        }
        try {
            conn = DriverManager.getConnection(localurl,localuser,localpass);
            /*Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Look, We are Successfully Connected to the Server.");
            alert.setContentText("I feel Good about this type of Things Faith!");
            alert.showAndWait();*/
        } catch (SQLException ex) {
            // 
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Database Connection Failure!");
            alert.setContentText("Looks like there's a problem connecting to the database!");
            alert.showAndWait();
            try {
                conn = DriverManager.getConnection(localurl,localuser,localpass);
            } catch (SQLException ex1) {
                Alert alerta = new Alert(AlertType.ERROR);
                alerta.setTitle("Error Dialog");
                alerta.setHeaderText("Database Connection Failure!");
                alerta.setContentText("Opps Looks like all our databases are Offline we are SORRY!");
                alerta.showAndWait();
            }
        }
        return conn;
        
    }

    
}