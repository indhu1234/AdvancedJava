package indhu.com.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import indhu.com.Model.Course;
import indhu.com.util.Hibernateutility;

public class CourseDaoImpl implements CourseDao
{

	@Override
	public Course getCourseByName(String courseName) {
		try
		{
		SessionFactory sf=Hibernateutility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Course.class);
		criteria.add(Restrictions.eq("courseName", courseName));
		Course course=(Course) criteria.uniqueResult();
		tx.commit();
		return course;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		return null;
	}
}
	@Override
	public List<Course> getAllCourses() {

		try {
		SessionFactory sf=Hibernateutility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		List<Course> allCourses=session.createQuery("from Course").list();
		tx.commit();
		return allCourses;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		return null;
	}
	}
	@Override
	public boolean addCourse(Course c) 
	{
		System.out.println("Add course method");
		SessionFactory sf=Hibernateutility.getSessionFactory();
		System.out.println("Session factory is ready");
		try
		{
		Session session2=sf.openSession();
		Transaction tx1=session2.beginTransaction();
		System.out.println("Before save");
		session2.save(c);
		session2.flush();
		System.out.println("After save");
		
		tx1.commit();
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
