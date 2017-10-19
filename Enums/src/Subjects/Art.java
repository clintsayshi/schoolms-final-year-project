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
public enum Art{
     
    Arts_7("Art Grade7") , Arts_8("Art Grade8"),    Arts_9("Art Grade9") , Arts_10("Art Grade10"),  Arts_11("Art Grade11"), Arts_12("Art Grade12");

    
    String Subject;
    
    private Art(String subj){
        Subject = subj;
    }
    
    public String getArt(){
        return Subject;
    }
    
}