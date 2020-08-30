package indhu.com.Model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
  private int addressId;
  private String street,lane,city;
  private String zip;
  
  public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getLane() {
	return lane;
}
public void setLane(String lane) {
	this.lane = lane;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
  
  
  
}
