package Numbers;


import Default.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcclint
 */
public class manager {
    
    public static String getG(String g){
        String a = "";
        if(g.equals("Grade 7")){
            a = "7";
        }
        if(g.equals("Grade 8"))
            a = "8";
        if(g.equals("Grade 9"))
            a = "9";
        if(g.equals("Grade 10"))
            a = "10";
        if(g.equals("Grade 11"))
            a = "11";
        if(g.equals("Grade 12"))
            a = "12";
        return a;
    }
    
    public static boolean validateLetters(String txt) {

        String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        return matcher.find();
    
    }

    public boolean isNumber(String number){
        try{
            Integer.parseInt(number);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    //field = new TextField() {
    public void replaceText(int start, int end, String text) {
        // If the replaced text would end up being invalid, then simply
        // ignore this call!
        if (!text.matches("[a-z]")) {
            //super.replaceText(start, end, text);
        }
    }
 
    public void replaceSelection(String text) {
        if (!text.matches("[a-z]")) {
           // super.replaceSelection(text);
        }
    }
    
    public static ArrayList<Integer> getCount(int value) throws SQLException{
        ArrayList<Integer> count = new ArrayList<>();
        String q = "select st.studentno from attendclass a, subject s, grade g, studentacc st" +
                    " where idattend = ?" +
                    " and a.subjectcode = s.subjectcode" +
                    " and g.gradecode = s.gradecode" +
                    " and g.gradecode = st.gradecode";
        PreparedStatement pt = db.getConnect().prepareStatement(q);
        pt.setInt(1, value);
        ResultSet found = pt.executeQuery();
        while(found.next()){
            count.add(found.getInt("studentno"));
        }
        return count;
    }
    
    public static ArrayList<Integer> getCounte(int value) throws SQLException{
        ArrayList<Integer> count = new ArrayList<>();
        String q = "select st.studentno from asses a, subject s, grade g, studentacc st" +
                    " where assindex = ?" +
                    " and a.subjectcode = s.subjectcode" +
                    " and g.gradecode = s.gradecode" +
                    " and g.gradecode = st.gradecode";
        PreparedStatement pt = db.getConnect().prepareStatement(q);
        pt.setInt(1, value);
        ResultSet found = pt.executeQuery();
        while(found.next()){
            count.add(found.getInt("studentno"));
        }
        return count;
    }
//};
}
