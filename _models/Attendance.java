/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _models;

import java.sql.Date;

/**
 *
 * @author mcclint
 */
public class Attendance {
    private int IdAttend;
    private String Subject;
    private String Teacher;
    private Date DateAttended;
    private String Grade;
    
    

    public int getIdAttend() {
        return IdAttend;
    }

    public void setIdAttend(int IdAttend) {
        this.IdAttend = IdAttend;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }

    public Date getDateAttended() {
        return DateAttended;
    }

    public void setDateAttended(Date DateAttended) {
        this.DateAttended = DateAttended;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    
}
