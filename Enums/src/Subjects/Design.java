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
 public enum Design {
     
    Desi_10("Design Grade10"),  Desi_11("Design Grade11"), Desi_12("Design Grade12");
    
    String Subject;
    
    private Design(String subj){
        Subject = subj;
    }
    
    public String getDesign(){
        return Subject;
    }
    
}