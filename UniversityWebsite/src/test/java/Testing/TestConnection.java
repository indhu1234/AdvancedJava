package Testing;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class TestConnection extends TestCase 
{
	@BeforeClass
	public void TestCon()
	{
	Configuration config=new Configuration();
	config.configure("HibernateConfiguration.xml");
	SessionFactory sf=config.buildSessionFactory();
	System.out.println("Connection is Success");
	}
      
}
