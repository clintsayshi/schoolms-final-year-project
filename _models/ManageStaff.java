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
public class ManageStaff {
    
    private int StaffNo;
    private String Names;
    private String Type;

    public ManageStaff(int StaffNo, String Names, String Type) {
        this.StaffNo = StaffNo;
        this.Names = Names;
        this.Type = Type;
    }

    public ManageStaff() {
    }
    
    public int getStaffNo() {
        return StaffNo;
    }

    public void setStaffNo(int StaffNo) {
        this.StaffNo = StaffNo;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
}
