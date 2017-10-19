package Default;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcclint
 * Insert a new student / Create a record for a new student
 */
public class AddStudent {
    
    //
  /*String InsertStudent1 = "START transaction" +
    " INSERT into country (country) value(?) " + 
    " SET @country_id = last_insert_id() " + 
    " INSERT into city (city, country_id) values(?, @country_id) " +
    " SET @city_id = last_insert_id() " + 
    " Insert into address (address, address2, district, city_id,postal_code) values(?,?,?,@city_id,?) " +
    " set @address_id = last_insert_id() " +
    " Insert into student(first_name,last_name,id_number,cell_no,home_no,address_id,dateof_birth) values(?,?,?,?,?,@address_id,?) " +
    " Commit;";*/
//  Add A Country
  String InsertCountry = "Insert Into Country(country) value(?)";
  String InsertCity = "Insert Into City(city, country_id) values(?,?)";
  String InsertAddress = "Insert Into Address(address,address2,district,city_id,postal_code) " + 
          "values (?, ?, ?, ?, ?)";
  String InsertStudent = " Insert Into Student(first_name, last_name,id_number, cell_no, home_no,address_id,dateof_birth) " + 
          "values(? ,?, ?, ?, ?, ?, ?)";
  String InsertGuardian = " Insert Into guardian(first_name, last_name, guardian_id,relationship, cellno, work_no, email ) " + 
          "values(? , ? , ? , ? , ? , ? , ?)";
  String InsertStG = " Insert Into student_guardian(student_number, guardian_number) " + 
          "values(? , ?)";
  
 /* String InsertKin = "START Transaction" + 
        "  INSERT into country (country) value(?) " + 
        " SET @country_id = last_insert_id() " + 
        " INSERT into city (city, country_id) values(?, @country_id) " +
        " SET @city_id = last_insert_id() " + 
        " Insert into address (address, address2, district, city_id,postal_code) values(?,?,?,@city_id,?) " +
        " set @address_id = last_insert_id() " +
        " Insert into guardian(first_name, last_name, relationship, cell_no, work_no,address_id) values(?,?,?,?,?,@address_id)"
          ;*/
}