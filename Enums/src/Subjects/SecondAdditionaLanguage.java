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
    
public enum SecondAdditionaLanguage {
     
    SecondAdditional_10("SecondAdditionaLanguage Grade10"),  SecondAdditional_11("SecondAdditionaLanguage Grade11"), SecondAdditional_12("SecondAdditionaLanguage Grade12");
    
    String Subject;
    
    private SecondAdditionaLanguage(String subj){
        Subject = subj;
    }
    
    public String getSecondAdditionaLanguage(){
        return Subject;
    }
    
}