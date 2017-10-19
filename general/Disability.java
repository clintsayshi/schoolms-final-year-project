/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *
 * @author mcclint
 */
public enum Disability {
    NONE("Not Disabled"),BLIND("Blind"), PARTIALLY_IGHTED("Partially Ighted"), IMPAIRED_MOBILITY("Impaired Mobility"), QUADRIPLEGIC("Quadriplegic"), CEREBRAL_PALSY("Cerebral Palsy"), PARAPLEGIC("Paraplegic"), DEAF("Deaf"), PARTIAL_HEARING("Partial Hearing"), ADD_ADHD("ADD/ADHD"),
    SPEECH("Speech"), LEARNING_DISABILITY("Learning Disability"), OTHER("Other");
    String dis;
    private Disability(String s){
      this.dis = s;   
    }
    
    public String getDisability(){
        return dis;
    }
}
