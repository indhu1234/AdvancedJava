package com.grantuniversity.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.grantuniversity.dao.CourseDao;
import com.grantuniversity.model.Course;
import com.grantuniversity.model.Student;
import com.grantuniversity.util.HibernateUtil;

public class CourseDaoImpl implements CourseDao{

	public Course getCourseByName(String courseName) {
		try
		{
			SessionFactory sf=HibernateUtil.getSessionFactory();
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

	public List<Course> getAllCourses() {
		try
		{
			SessionFactory sf=HibernateUtil.getSessionFactory();
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

}
