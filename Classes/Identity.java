package Classes;

import java.util.Date;

public class Identity {
	
    //private String id;
    private String dob;
    private char gender;

    public Identity(String dob, char gender) {
        //this.id = id;
        this.dob = dob;
        this.gender = gender;
    }

    public Identity() {
        //this.id = "";
        this.dob = "";
        //gender = '';
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
}
