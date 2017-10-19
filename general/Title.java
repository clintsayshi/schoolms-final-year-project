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
public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), MISS("Miss");
    String title;
    private Title(String s){
      this.title = s;   
    }
    
    public String getTitle(){
        return title;
    }
}
