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

    
public enum ConsumerStudies {
     
    Consumer_10("ConsumerStudies Grade10"),  Consumer_11("ConsumerStudies Grade11"), Consumer_12("ConsumerStudies Grade12");
    
    String Subject;
    
    private ConsumerStudies(String subj){
        Subject = subj;
    }
    
    public String getConsumerStudies(){
        return Subject;
    }
    
}