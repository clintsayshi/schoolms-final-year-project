/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _models;

/**
 *
 * @author 201505012
 */
public class TeacherSubject {
    private int StaffNo;
    private String StaffNames;
    private String SubjectCode;
    private String Subject;

    @Override
    public String toString() {
        return "TeacherSubject{" + "StaffNo=" + StaffNo + ", StaffNames=" + StaffNames + ", SubjectCode=" + SubjectCode + ", Subject=" + Subject + '}';
    }

    public int getStaffNo() {
        return StaffNo;
    }

    public void setStaffNo(int StaffNo) {
        this.StaffNo = StaffNo;
    }

    public String getStaffNames() {
        return StaffNames;
    }

    public void setStaffNames(String StaffNames) {
        this.StaffNames = StaffNames;
    }

    public String getSubjectCode() {
        return SubjectCode;
    }

    public void setSubjectCode(String SubjectCode) {
        this.SubjectCode = SubjectCode;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    
    
}
