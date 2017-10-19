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
public enum LIfeSciences {
     
    LIfeSci_10("LIfeSciences Grade10"),  LIfeSci_11("LIfeSciences Grade11"), LIfeSci_12("LIfeSciences Grade12");
    
    String Subject;
    
    private LIfeSciences(String subj){
        Subject = subj;
    }
    
    public String getLIfeSciences(){
        return Subject;
    }
    
}