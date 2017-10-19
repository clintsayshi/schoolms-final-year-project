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
public enum Religion {
    CHRISTIAN("Christianity"), HINDU("Hindu"), JEWISH("Jewish"), MUSLIM("Muslim");
    String dis;
    private Religion(String s){
      this.dis = s;   
    }
    
    public String getReligion(){
        return dis;
    }
}
