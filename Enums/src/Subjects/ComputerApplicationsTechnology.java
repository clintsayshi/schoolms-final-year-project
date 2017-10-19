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
    
public enum ComputerApplicationsTechnology {
     
    CAT_7("ComputerApplicationsTechnology Grade7"), CAT_8("ComputerApplicationsTechnology Grade8"), CAT_10("ComputerApplicationsTechnology Grade10"),  CAT_11("ComputerApplicationsTechnology Grade11"), CAT_12("ComputerApplicationsTechnology Grade12");
    
    String Subject;
    
    private ComputerApplicationsTechnology(String subj){
        Subject = subj;
    }
    
    public String getComputerApplicationsTechnology(){
        return Subject;
    }
    
}