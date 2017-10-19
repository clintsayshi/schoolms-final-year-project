/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Default.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author 201505012
 */
public class PrintReports {
    
    public static void reportReg(int st){
        try {
            Map<String, Object> map = new HashMap<>();
            Connection conn = db.getConnect();
            
           /* map.put("studentno", "select s.fname,s.lname,s.idnumber,s.studentno,ss.subjectcode,ss.subjectname,g.gradename" +
                    " from student s, studentacc sa,subject ss, grade g" +
                    " where s.studentno = sa.studentno" +
                    " and sa.gradecode = ss.gradecode" +
                    " and ss.gradecode = g.gradecode" +
                    " and s.studentno =" + st);*/
            map.put("studentno",st);
            JasperReport report = JasperCompileManager.compileReport("C:\\Users\\201505012\\Desktop\\My desktop\\SchoolManagementSystem\\src\\data\\smsreports.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(report, map, conn);
            JasperViewer.viewReport(jp, false);
            db.getConnect().close();
        } catch (JRException ex) {
            Logger.getLogger(PrintReports.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void reportAttend(String st){
        try {
            Map<String, Object> map = new HashMap<>();
            Connection conn = db.getConnect();
            
           /* map.put("studentno", "select s.fname,s.lname,s.idnumber,s.studentno,ss.subjectcode,ss.subjectname,g.gradename" +
                    " from student s, studentacc sa,subject ss, grade g" +
                    " where s.studentno = sa.studentno" +
                    " and sa.gradecode = ss.gradecode" +
                    " and ss.gradecode = g.gradecode" +
                    " and s.studentno =" + st);*/
            map.put("studentno",st);
            JasperReport report = JasperCompileManager.compileReport("C:\\Users\\201505012\\Desktop\\My desktop\\SchoolManagementSystem\\src\\data\\reportattend.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(report, map, conn);
            JasperViewer.viewReport(jp, false);
            db.getConnect().close();
        } catch (JRException ex) {
            Logger.getLogger(PrintReports.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrintReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
