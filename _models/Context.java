/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _models;

/**
 *
 * @author mcclint
 */
public class Context {
    private final static Context instance = new Context();

    public static Context getInstance() {
        return instance;
    }

    private Test selectedTest = new Test();
    private Student selectedStudent = new Student();

    public Student currentStudent(){
       return selectedStudent;
    }
    public Test getTest() {
        return selectedTest;
    }
}