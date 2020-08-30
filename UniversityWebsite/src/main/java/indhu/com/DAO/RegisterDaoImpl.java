package indhu.com.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import indhu.com.Model.Student;
import indhu.com.util.Hibernateutility;


public class RegisterDaoImpl implements RegisterDao
{

	@Override
	public boolean register(Student s) 
	{
		SessionFactory sf=Hibernateutility.getSessionFactory();
		try
		{
		System.out.println("From Implementation");
		Session session1=sf.openSession();
		System.out.println("Session created for student class");
		
		Transaction tx1=session1.beginTransaction();
		
		session1.save(s);
		System.out.println("Record Saved in session");
		
		session1.flush();
		
		
		tx1.commit();
		
		System.out.println("Committing the transaction");
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Error occurred");
			e.printStackTrace();
			return false;
		}
		
	}

}
