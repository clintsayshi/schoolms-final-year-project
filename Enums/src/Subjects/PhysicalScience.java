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
    
public enum PhysicalScience {
     
    Physical_10("PhysicalScience Grade10"),  Physical_11("PhysicalScience Grade11"), Physical_12("PhysicalScience Grade12");
    
    String Subject;
    
    private PhysicalScience(String subj){
        Subject = subj;
    }
    
    public String getPhysicalScience(){
        return Subject;
    }
}