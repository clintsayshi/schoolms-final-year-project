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
public class ViewStaff {
    private int StaffNo;
    private String Name;
    private String StaffType;
    private String CellNumber;
    private String Email;
    private String Status;

    public ViewStaff(int StaffNo, String fname, String lname, String StaffType, String CellNumber, String Email, String Status) {
        this.StaffNo = StaffNo;
        this.Name = fname + " " + lname;
        this.StaffType = StaffType;
        this.CellNumber = CellNumber;
        this.Email = Email;
        this.Status = Status;
    }

    public ViewStaff() {
        this.StaffNo = 0;
        this.Name = "";
        this.StaffType = "";
        this.CellNumber = "";
        this.Email = "";
        this.Status = "";
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getStaffNo() {
        return StaffNo;
    }

    public void setStaffNo(int StaffNo) {
        this.StaffNo = StaffNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String fname, String lname) {
        this.Name = fname + " " + lname;
    }

    public String getStaffType() {
        return StaffType;
    }

    public void setStaffType(String StaffType) {
        this.StaffType = StaffType;
    }

    public String getCellNumber() {
        return CellNumber;
    }

    public void setCellNumber(String CellNumber) {
        this.CellNumber = CellNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
