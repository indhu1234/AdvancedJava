package task3;

public class Account 
{
   private String accnum;
   private String accstartdate;
   private double balance;
   private String acctype;
public String getAccnum() {
	return accnum;
}
public void setAccnum(String accnum) {
	this.accnum = accnum;
}
public String getAccstartdate() {
	return accstartdate;
}
public void setAccstartdate(String accstartdate) {
	this.accstartdate = accstartdate;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
   
    public Account()
    {
    	
    }
    public Account(String no, String type,String stdate,double balance)
    {
    	accnum=no;
    	acctype=type;
    	accstartdate=stdate;
    	this.balance=balance;
    }
	
    
}
