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
public enum Accounting{
     
    Account_10("Accounting Grade10"),  Account_11("Accounting Grade11"), Account_12("Accounting Grade12");
    
    String Subject;
    
    private Accounting(String subj){
        Subject = subj;
    }
    
    public String getAccounting(){
        return Subject;
    }
    
}