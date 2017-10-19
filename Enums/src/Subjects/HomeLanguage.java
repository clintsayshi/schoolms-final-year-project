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
public enum HomeLanguage {
     
    HomeLang_7("HomeLanguage Grade7"),  HomeLang_8("HomeLanguage Grade8"),  HomeLang_9("HomeLanguage Grade9"),  HomeLang_10("HomeLanguage Grade10"),  HomeLang_11("HomeLanguage Grade11"), HomeLang_12("HomeLanguage Grade12");
    
    String Subject;
    
    private HomeLanguage(String subj){
        Subject = subj;
    }
    
    public String getHomeLanguage(){
        return Subject;
    }
    
}