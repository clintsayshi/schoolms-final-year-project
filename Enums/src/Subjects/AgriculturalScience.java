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
    
public enum AgriculturalScience {
     
    Agricultural_10("AgriculturalScience Grade10"),  Agricultural_11("AgriculturalScience Grade11"), Agricultural_12("AgriculturalScience Grade12");
    
    String Subject;
    
    private AgriculturalScience(String subj){
        Subject = subj;
    }
    
    public String getAgricultural(){
        return Subject;
    }
    
}
