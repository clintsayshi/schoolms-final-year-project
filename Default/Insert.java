package Default;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcclint
 */
public class Insert {
    // Insert Address
    private String Address = "Insert Into address(address,city_code,postal_code,neighborhood) " + 
          "values (?, ?, ?, ?)";
    // Insert Student
    private String Student = " Insert Into student(fname, lname,idnumber,ppnumber,dateofbirth , cellno, homeno, email,, gender, addressid) " + 
          "values(? ,?, ?, ?, ?, ?, ?)";
    // Insert Next of Kin
    private String Kin = " Insert Into nextofkin(fname, lname, idnumber, ppnumber, dateofbirth, cellno, email, workno, job, placeofwork, gender, address_id) " + 
          "values(? , ? , ? , ? , ? , ? , ?, ?)";
    // Insert StudentKin
    private String StudentKin = " Insert Into studentkin(studentno, kinnumber, relationship) " + 
          "values(? ,? ,?)";
    // Insert 
    private String StudentAcc = " Insert Into enrollment(studentno, status, gradecode)" + 
          "values(? , ?, ?)";
    
    private static String Staff = "Insert into Staff(firstname, lastname, idno, ppno, dateofb, cellnumber, homenumber, email, gndr, addressid) "
            + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public String getStudent() {
        return Student;
    }

    public static String getStaff() {
        return Staff;
    }
    
    
}
