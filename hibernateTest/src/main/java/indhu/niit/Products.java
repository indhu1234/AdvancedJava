package indhu.niit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Products 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   int pid;
   String pName;
   String pDesc;
   double price;
   int qty;
   
   @ManyToOne
   Category category;
   
   
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpDesc() {
	return pDesc;
}
public void setpDesc(String pDesc) {
	this.pDesc = pDesc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
   
   
}
