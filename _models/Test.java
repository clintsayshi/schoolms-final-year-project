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
public class Test {
    private String Name;
    private String SubjectName;
    private String Type;
    private Date DayOfWriting;
    private Date DueDate;
    private String Grade;
    private int AssIndex;

    public Test(String Name, String SubjectName, String Type, Date DayOfWriting, Date DueDate, String Grade, int AssIndex) {
        this.Name = Name;
        this.SubjectName = SubjectName;
        this.Type = Type;
        this.DayOfWriting = DayOfWriting;
        this.DueDate = DueDate;
        this.Grade = Grade;
        this.AssIndex = AssIndex;
    }

    public Test() {
    }

    public int getAssIndex() {
        return AssIndex;
    }

    public void setAssIndex(int AssIndex) {
        this.AssIndex = AssIndex;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Date getDayOfWriting() {
        return DayOfWriting;
    }

    public void setDayOfWriting(Date DayOfWriting) {
        this.DayOfWriting = DayOfWriting;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date Duration) {
        this.DueDate = Duration;
    }
    
}
