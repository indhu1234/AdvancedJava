package indhu.niit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testingconnection 
{
	public static void main(String[] args)
	{
		Configuration c=new Configuration();
		c.configure("hibernateConfig.xml");
		SessionFactory sf=c.buildSessionFactory();
		System.out.println("Connection Success");
		Session S=sf.openSession();
		Products p=new Products();
		Category cat=new Category();
		Products p1=new Products();
		p.setpName("Samsung Galaxy");
		p.setpDesc("Good Quality");
		p.setPrice(23000);
		p.setQty(10);
		S.save(p);
		Transaction T=S.beginTransaction();
		T.commit();
		
		cat.setCatName("Mobile Models");
		cat.setCatDesc("Good in Quality");
		
		S.save(cat);
		
		Transaction T1=S.beginTransaction();
		T1.commit();
		
		p1.setCategory(cat);
		p1.setpName("Redmi Mobile");
		p1.setpDesc("Good Quality");
		p1.setPrice(20000);
		p1.setQty(5);
		
		S.save(p1);
		Transaction T2=S.beginTransaction();
		T2.commit();
		Products p2=new Products();
//		
		p2.setCategory(cat);
		p2.setpName("One Plus Mobile");
		p2.setpDesc("Good Quality");
		p2.setPrice(20000);
		p2.setQty(5);
		
		S.save(p2);
		Transaction T3=S.beginTransaction();
		T3.commit();
	}

}
