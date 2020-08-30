package com.grantuniversity.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.grantuniversity.dao.LoginDao;
import com.grantuniversity.model.Student;
import com.grantuniversity.util.HibernateUtil;

public class LoginDaoImpl implements LoginDao {

	public Student validUser(String username, String password) {
		
		try
		{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			List<Student> result=session.createQuery("from Student where userid=:userName").setParameter("userName", username).list();
			tx.commit();
			//Student student=new Student();
			int flag=0;
			Student student=new Student();
			for(Student stud:result)
			{
				if(stud.getUserid().equals(username) && stud.getPassword().equals(password))
				{
					flag=1;
					student.setDob(stud.getDob());
					student.setEmail(stud.getEmail());
					student.setFirstname(stud.getFirstname());
					student.setGender(stud.getGender());
					student.setLastname(stud.getLastname());
					student.setPassword(student.getPassword());
					student.setPhone(stud.getPhone());
					student.setStudentAddress(stud.getStudentAddress());
					student.setUserid(stud.getUserid());
					break;
				}
			}
			if(flag==1)
			{
				return student;
			}
			else
			{
				return null;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

}
