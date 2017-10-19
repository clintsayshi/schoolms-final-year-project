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
public enum PopulationGroup {
    
    AFRICAN("African"), COLOURED("Coloured"), WHITE("White"), INDIAN("Indian"), CHINESE("Indian"), OTHER("Other");
    
    String dis;
    private PopulationGroup(String s){
      this.dis = s;   
    }
    public String getPopulationGroup(){
        return dis;
    }
}
