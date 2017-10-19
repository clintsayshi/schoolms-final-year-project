package _models;
import general.Gender;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Clinton 12/8/2016.
 */
public class Student {
    private String Gender;
    private int StudentNo;
    private String fname;
    private String lname;
    private String GradeName;
    private String IdNo;
    private String PassPortNo;
    private String DateOfBirth;
    private String CellNumber;
    private String HomeNumber;
    private String Email;
    private String Address;
    private String City;
    private String ZipCode;

    public Student(String Gender, int StudentNo, String fname, String lname, String GradeName) {
        this.Gender = Gender;
        this.StudentNo = StudentNo;
        this.fname = fname;
        this.lname = lname;
        this.GradeName = GradeName;
    }

   // public Student() {
   // }

    public Student() {
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setStudentNo(int StudentNo) {
        this.StudentNo = StudentNo;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGradeName(String GradeName) {
        this.GradeName = GradeName;
    }

    
    public String getGender() {
        return Gender;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getGradeName() {
        return GradeName;
    }
    
}
