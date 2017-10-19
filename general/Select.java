/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import Default.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mcclint
 */
public class Select {
    public static ObservableList<String> List;
    
    public static ObservableList<String> getDisability(){
        List = FXCollections.observableArrayList();
        for(Disability Item: Disability.values()){
            List.add(Item.getDisability());
        }
        return List;
    } 
    
    public static ObservableList<String> getLanguage(){
        List = FXCollections.observableArrayList();
        for(Language Item: Language.values()){
            List.add(Item.getLanguage());
        }
        return List;
    }
    
    public static ObservableList<String> getPGroup(){
        List = FXCollections.observableArrayList();
        for(PopulationGroup Item: PopulationGroup.values()){
            List.add(Item.getPopulationGroup());
        }
        return List;
    }
    
    public static ObservableList<String> getReligion(){
        List = FXCollections.observableArrayList();
        for(Religion Item: Religion.values()){
            List.add(Item.getReligion());
        }
        return List;
    }
    
    public static ObservableList<String> getRelationship(){
        List = FXCollections.observableArrayList();
        for(Relationship Item: Relationship.values()){
            List.add(Item.getRelationship());
        }
        return List;
    }
    
    public static ObservableList<String> getTitle(){
        List = FXCollections.observableArrayList();
        for(Title Item: Title.values()){
            List.add(Item.getTitle());
        }
        return List;
    }
    
    public static ObservableList<String> getField(String table,String field) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table;
        ResultSet rs = db.getConnect().createStatement().executeQuery(select);
        ObservableList<String> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            
            arr.add( rs.getString(1) );
            
        }
       
        return arr;
    }
    
    public static ObservableList<Integer> getSt(String table,String field) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table;
        ResultSet rs = db.getConnect().createStatement().executeQuery(select);
        ObservableList<Integer> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            
            arr.add( rs.getInt(1) );
            
        }
       
        return arr;
    }
    
    public static ObservableList<String> getStudentId(String table,String field) throws SQLException{
        String select = "SELECT " + field  + " FROM " + table;
        ResultSet rs = db.getConnect().createStatement().executeQuery(select);
        ObservableList<String> arr = FXCollections.observableArrayList();
        int count = 0;
        while(rs.next()){
            
            arr.add( rs.getString(1) );
            
        }
       
        return arr;
    }
    
    public static int getSchool(String field) throws SQLException{
        String select = "SELECT schoolcode FROM school where name = '" + field + "'";
        ResultSet rs = db.getConnect().createStatement().executeQuery(select);
        int code = 0;
        while(rs.next()){
            code = rs.getInt("schoolcode");
        }
        return code;
    }
}
