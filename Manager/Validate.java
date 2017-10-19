/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Classes.Identity;
import Default.db;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mcclint
 */
public class Validate {
    //
    static Identity identity = new Identity();
    public boolean studentExist(String value,String table,String field){
        try {
            String select;// = "SELECT "+id+" FROM " + table + " WHERE " + id + " = '"+std+"'";
            if(field.equals(null))
                select = "SELECT "+field+" FROM " + table + " WHERE " + field + " = '"+value+"'";
            else
                select = "SELECT "+field+" FROM " + table + " WHERE " + field + " = '"+value+"'";
            ResultSet rs = null;
            
            rs = Query(select);
            
            int count = 0;
            
            while(rs.next()){
                count  = count + 1;
            }
            
            if(count == 1){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Validate.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    // Validate ID
    public static Boolean isValidID(BigInteger identities){
    char[] idchars = identities.toString().toCharArray();
    int sum = 0;
    // loop over each digit right-to-left, including the check-digit
    for (int i = 1; i <= idchars.length; i++) {
        int digit = Character.getNumericValue(idchars[idchars.length - i]);
        if ((i % 2) != 0) {
            sum += digit;
        } else {
            sum += digit < 5 ? digit * 2 : digit * 2 - 9;
        }
    }
    return (sum % 10) == 0;
    }
    // Check Date
    public static Identity checkYears(String myid){
        Calendar d = Calendar.getInstance();
        BigInteger i = new BigInteger(myid);
        String tt = myid.substring(0, 2);
        String dob = "";
        if(isValidID(i)){
        if(Integer.parseInt(tt.substring(0, 1)) == 0 && Integer.parseInt(tt.substring(1, 2)) > 0){
            tt = tt.substring(1, 2);
            System.out.println("" + tt);
            String s = "200" + tt;
            dob = s + "/" + myid.substring(2, 4) + "/" + myid.substring(4, 6);
            int ag = Integer.parseInt(myid.substring(7, 8));
            char g = ag <= 4 ? 'F' : 'M';
            int age = d.get(Calendar.YEAR) - Integer.parseInt(s);
            identity = new Identity( dob, g);
             System.out.println("Age: " + age + " G: " + g);
        }else if(Integer.parseInt(tt.substring(0, 1)) == 1 && Integer.parseInt(tt.substring(1, 2)) >= 0){
            tt = tt.substring(0, 2);
            System.out.println("" + tt);
            String s = "20" + tt;
            dob = s + "/" + myid.substring(2, 4) + "/" + myid.substring(4, 6);
            int ag = Integer.parseInt(myid.substring(7, 8));
            char g = ag <= 4 ? 'F' : 'M';
            int age = d.get(Calendar.YEAR) - Integer.parseInt(s);
            identity = new Identity( dob, g);
             System.out.println("Age: " + age + " G: " + g);
        }
        else if(Integer.parseInt(tt.substring(0, 2)) == 00){
            String s = "20" + tt;
            dob = s + "/" + myid.substring(2, 4) + "/" + myid.substring(4, 6);
            int ag = Integer.parseInt(myid.substring(7, 8));
            char g = ag <= 4 ? 'F' : 'M';
            int age = d.get(Calendar.YEAR) - Integer.parseInt(s);
            identity = new Identity( dob, g);
            System.out.println("Age: " + age + " G: " + g);
        }
        else if(Integer.parseInt(tt.substring(0, 2)) < 90){
            String s = "19" + tt;
            dob = s + "/" + myid.substring(2, 4) + "/" + myid.substring(4, 6);
            int ag = Integer.parseInt(myid.substring(7, 8));
            char g = ag <= 4 ? 'F' : 'M';
            int age = d.get(Calendar.YEAR) - Integer.parseInt(s);
            identity = new Identity( dob, g);
            System.out.println("Age: " + age + " G: " + g);
        }else if(Integer.parseInt(tt.substring(0, 2)) >= 90 && Integer.parseInt(tt.substring(0, 2)) <= 99){
            String s = "19" + tt;
            dob = s + "/" + myid.substring(2, 4) + "/" + myid.substring(4, 6);
            int ag = Integer.parseInt(myid.substring(7, 8));
            char g = ag <= 4 ? 'F' : 'M';
            int age = d.get(Calendar.YEAR) - Integer.parseInt(s);
            identity = new Identity( dob, g);
             System.out.println("Age: " + age + " G: " + g);
        }
        }else{
            System.out.println("Is an Invalid IDentity Number.");
        }
        return identity;
    }
    //
    public ResultSet Query(String query) throws SQLException{
        
         Statement st = db.getConnect().createStatement();
         ResultSet rs = st.executeQuery(query);
         
         return rs;
    }
}
