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
public enum Technology{
     
    Techn_10("Technology Grade10"),  Techn_11("Technology Grade11"), Techn_12("Technology Grade12");
    
    String Subject;
    
    private Technology(String subj){
        Subject = subj;
    }
    
    public String getTechnology(){
        return Subject;
    }
    
}