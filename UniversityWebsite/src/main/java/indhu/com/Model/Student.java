package indhu.com.Model;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
   private int userId;
   private String firstName,lastName,gender;
   private Date dob;
   String phone,email,userName,password;
   @ManyToOne(cascade=CascadeType.ALL)
   private Address studAddr;
  
   public Student()
   {
	   
   }
public Student(int userId) {
	
	this.userId = userId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Address getStudAddr() {
	return studAddr;
}
public void setStudAddr(Address studAddr) {
	this.studAddr = studAddr;
}
   
   
}
