/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Default.db;
import com.jfoenix.controls.JFXComboBox;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;

/**
 *
 * @author mcclint
 */
public class SetupComboBox {
    
    public static void initTitle(JFXComboBox<Label> titleComboBox){ 
        titleComboBox.getItems().add(new Label("Mr"));
        titleComboBox.getItems().add(new Label("Mrs"));
        titleComboBox.getItems().add(new Label("Miss"));
        titleComboBox.getItems().add(new Label("Other"));
    }
    //
    public static void initStaffType(JFXComboBox<String> ComboBox){ 
        ComboBox.getItems().add("Teacher");
        ComboBox.getItems().add("Principal");
        ComboBox.getItems().add("Clerk");
        ComboBox.getItems().add("Other");
    }
    public static void initG(JFXComboBox<String> ComboBox){
        try {
            ComboBox.setItems(getField("Grade", "gradename"));
        } catch (SQLException ex) {
            Logger.getLogger(SetupComboBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    public static void initGrade(JFXComboBox<String> ComboBox){ 
        ComboBox.getItems().add("Grade 7");
        ComboBox.getItems().add("Grade 8");
        ComboBox.getItems().add("Grade 9");
        ComboBox.getItems().add("Grade 10");
        ComboBox.getItems().add("Grade 11");
        ComboBox.getItems().add("Grade 12");
    }
    // From
    //
    public static void initProvince(JFXComboBox<String> ComboBox){ 
        ComboBox.getItems().add("Limpopo");
        ComboBox.getItems().add("Mpumalanga");
        ComboBox.getItems().add("Gauteng");
        ComboBox.getItems().add("Eastern Cape");
        ComboBox.getItems().add("Western Cape");
        ComboBox.getItems().add("KwaZulu-Natal");
        ComboBox.getItems().add("North West");
        ComboBox.getItems().add("Northern Cape");
        ComboBox.getItems().add("Free State");
    }
    //
    public static void initAssType(JFXComboBox<String> ComboBox){
        ComboBox.getItems().add("Test");
        ComboBox.getItems().add("Assignement");
        ComboBox.getItems().add("Quiz");
        ComboBox.getItems().add("Practial Work");
        ComboBox.getItems().add("Other");
    }
    //
    public static void initStaff(JFXComboBox<Integer> ComboBox, String where){
        ObservableList<Integer> arr = FXCollections.observableArrayList();
        try {
            String sql = "Select staffno from staffacc where usertype='" + where + "'";
            ResultSet rs = Query(sql);
            int count = 0;
            while(rs.next()){
                arr.add( rs.getInt("staffno") );
            }
            ComboBox.setItems(arr);
        } catch (SQLException ex) {
            Logger.getLogger(SetupComboBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    public static void initSubject(JFXComboBox<String> ComboBox, String where){
        try {
            ComboBox.setItems(getField("Subject", "subjectname", where));
        } catch (SQLException ex) {
            Logger.getLogger(SetupComboBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ObservableList<String> getField(String table,String field, String where) throws SQLException{
        String select = "SELECT subjectname FROM subject where gradecode ='"+where+"'";
        ResultSet rs = Query(select);
        ObservableList<String> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            
            arr.add( rs.getString(1) );
            
        }
        
        return arr;
    }
     public static ObservableList<String> getFField(String table,String field, String f) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table + " where gradecode = '" + f + "'";
        ResultSet rs = Query(select);
        ObservableList<String> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            arr.add( rs.getString(1) );
        }
        return arr;
    }
    
    public static String getGrade(String table,String field, String f) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table + " where gradename = '" + f + "'";
        ResultSet rs = Query(select);
        String s = "";
        while(rs.next()){
            s = rs.getString(1);
        }
        return s;
    }
     
    public static ObservableList<String> getField(String table,String field) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table;
        ResultSet rs = Query(select);
        ObservableList<String> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            arr.add( rs.getString(1) );
        }
        return arr;
    }
    public static ObservableList<Integer> getTheField(String table,String field) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table;
        ResultSet rs = Query(select);
        ObservableList<Integer> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            arr.add( rs.getInt(1) );
        }
        return arr;
    }
    public static String getField(int st, int index) throws SQLException{
        String select = "SELECT mark FROM studentmarks where studentno = "+st+" and assindex="+index+"";
        ResultSet rs = Query(select);
        String m = "";
        int count = 0;
        while(rs.next()){
            
            m = rs.getString(1);
            
        }
        return m;
    }
    
    public static String getStatus(int st, int idattend) throws SQLException{
        String select = "SELECT status FROM studentattend where studentno = "+st+" and idattend="+idattend+"";
        ResultSet rs = Query(select);
        String m = "";
        int count = 0;
        while(rs.next()){
            m = rs.getString(1);
        }
        return m;
    }
    public static ResultSet Query(String query) throws SQLException{
        
        
         Connection con = db.getConnect();
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query);
         
         return rs;
    }
    //
    public static void testCombo(JFXComboBox<Label> titleComboBox){
        String s = titleComboBox.getSelectionModel().getSelectedItem().getText();
        System.out.println(s);
    }
}
