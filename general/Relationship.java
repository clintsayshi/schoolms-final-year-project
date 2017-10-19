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
public enum Relationship {
    MOTHER("Mother"), FATHER("Father"), BROTHER("Brother"), SISTER("Sister"), UNCLE("Uncle"), AUNT("Aunt"), Guardian("Guardian");
    String dis;
    private Relationship(String s){
      this.dis = s;   
    }
    
    public String getRelationship(){
        return dis;
    }
}
