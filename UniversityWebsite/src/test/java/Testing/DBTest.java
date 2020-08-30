package Testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import indhu.com.Model.Address;
import indhu.com.Model.Student;
import indhu.com.DAO.*;
public class DBTest 
{
    static RegisterDao registerdao;
	public static void main(String ar[])
	{
	try {
	Configuration config=new Configuration();
	config.configure("HibernateConfiguration.xml");
	SessionFactory sf=config.buildSessionFactory();
	Session session=sf.openSession();
	registerdao=new RegisterDaoImpl();
	System.out.println("Connection is Success");
	Student st=new Student();
	st.setFirstName("Aruna");
	st.setLastName("A");
	String dob="01/01/1990";
	Date dateOfBirth;
	
		dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
	
	st.setDob(dateOfBirth);
	st.setEmail("aruna@gmail.com");
	st.setPhone("8877665544");
	st.setUserName("aruna");
	st.setPassword("12345");
	st.setGender("Female");
	Address addr=new Address();
	addr.setStreet("New Street");
	addr.setLane("SouthBoag Road");
	addr.setCity("Trichy");
	addr.setZip("678456");
	session.save(addr);
	//session.flush();
    Transaction tx=session.beginTransaction();
    tx.commit();
	registerdao.register(st);
	System.out.println("Record inserted Successfully");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
