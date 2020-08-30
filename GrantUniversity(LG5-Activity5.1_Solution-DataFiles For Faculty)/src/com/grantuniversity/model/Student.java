package com.grantuniversity.model;

import java.io.Serializable;
import java.util.Date;


public class Student  implements Serializable {


     private String userid;
     private String firstname;
     private String lastname;
     private String gender;
     private Date dob;
     private Address studentAddress;
     private String phone;
     private String email;
     private String password;
     private StudentCourse studentCourse;
     
    public Student() {
    }

	
    public Student(String userid) {
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
  
  

	public Address getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(Address studentAddress) {
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


	public StudentCourse getStudentCourse() {
		return studentCourse;
	}


	public void setStudentCourse(StudentCourse studentCourse) {
		this.studentCourse = studentCourse;
	}
    
    
}