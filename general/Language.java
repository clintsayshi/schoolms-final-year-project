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
public enum Language {
    SEPEDI("Sepedi"), ISIZULU("IsiZulu"), ENGLISH("English"), ISINDEBELE("IsiNdebele"), XITSONGA("Xitsonga"), SESOTHO("Sesotho"), SETSWANA("Setswana"), SISWATI("Siswait"),ISIXHOSA("IsiXhosa"), TSHIVENDA("Tshivenda"),AFRIKAANS("Afrikaans");
    String dis;
    private Language(String s){
      this.dis = s;   
    }
    
    public String getLanguage(){
        return dis;
    }
}
