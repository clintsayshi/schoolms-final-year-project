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
public enum Economics {
     
    Economi_10("Economics Grade10"),  Economi_11("Economics Grade11"), Economi_12("Economics Grade12");
    
    String Subject;
    
    private Economics(String subj){
        Subject = subj;
    }
    
    public String getEconomics(){
        return Subject;
    }
    
}