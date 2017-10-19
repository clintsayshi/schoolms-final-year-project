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
public enum AgriculturalManagement {
     
    Agricultural_10("AgriculturalManagement Grade10"),  Agricultural_11("AgriculturalManagement Grade11"), Agricultural_12("AgriculturalManagement Grade12");
    
    String Subject;
    
    private AgriculturalManagement(String subj){
        Subject = subj;
    }
    
    public String getAgricultural(){
        return Subject;
    }
    
}
