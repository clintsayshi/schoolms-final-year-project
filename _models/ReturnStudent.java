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
public class ReturnStudent {
    private String IdentityNumber;
    private int StudentNumber;
    private String fname;
    private String lname;
    private String grade;

    public String getIdentityNumber() {
        return IdentityNumber;
    }

    public void setIdentityNumber(String IdentityNumber) {
        this.IdentityNumber = IdentityNumber;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
}
