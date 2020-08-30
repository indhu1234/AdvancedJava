package model;

import java.io.Serializable;
import java.util.Date;


public class StudentTable  implements Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userid;
     private String firstname;
     private String lastname;
     private String gender;
     private Date dob;
     private AddressTable studentAddress;
     private String phone;
     private String email;
     private String password;

    public StudentTable() {
    }

	
    public StudentTable(String userid) {
        this.userid = userid;
    }
   
   
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
  
  

	public AddressTable getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(AddressTable studentAddress) {
		this.studentAddress = studentAddress;
	}


	public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}