package com.grantuniversity.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.grantuniversity.dao.RegisterDao;
import com.grantuniversity.model.Student;
import com.grantuniversity.util.HibernateUtil;

public class RegisterDaoImpl implements RegisterDao {

	public boolean register(Student s) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		try
		{
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.save(s);
			session.flush();
			tx.commit();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
}
