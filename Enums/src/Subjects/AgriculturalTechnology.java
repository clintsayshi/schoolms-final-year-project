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
    
public enum AgriculturalTechnology {
     
    Agricultural_10("AgriculturalTechnology Grade10"),  Agricultural_11("AgriculturalTechnology Grade11"), Agricultural_12("AgriculturalTechnology Grade12");
    
    String Subject;
    
    private AgriculturalTechnology(String subj){
        Subject = subj;
    }
    
    public String getAgricultural(){
        return Subject;
    }
    
}
