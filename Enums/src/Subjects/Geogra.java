/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subjects;

/**
 *
 * @author SIBUSISO
 */
public enum Geogra {
     
    Geog_10("Geogra Grade10"),  Geog_11("Geogra Grade11"), Geog_12("Geogra Grade12");
    
    String Subject;
    
    private Geogra(String subj){
        Subject = subj;
    }
    
    public String getGeogra(){
        return Subject;
    }
    
}