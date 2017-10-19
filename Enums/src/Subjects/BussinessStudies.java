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

 public enum BussinessStudies {
     
   Bussiness_10("BussinessStudies Grade10"),  Bussiness_11("BussinessStudies Grade11"), Bussiness_12("BussinessStudies Grade12");
    
    String Subject;
    
    private BussinessStudies(String subj){
        Subject = subj;
    }
    
    public String getBussinessStudies(){
        return Subject;
    }
    
}