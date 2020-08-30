package indhu.niit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category 
{
	@Id
	@GeneratedValue
 int cId;
 String catName;
 String catDesc;
 
 
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
public String getCatDesc() {
	return catDesc;
}
public void setCatDesc(String catDesc) {
	this.catDesc = catDesc;
}
 
 
}
