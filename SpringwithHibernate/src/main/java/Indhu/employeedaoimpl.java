package Indhu;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeService")
@Transactional
public class employeedaoimpl implements employeeservices 
{

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public boolean addEmployee(Employee emp) 
	{
		System.out.println("Add the employee details");
	  	sessionfactory.getCurrentSession().save(emp);
	  	return true;
	 }
	@Override
	public List<Employee> listemployee() {
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Employee");
		List<Employee> listemp=query.list();
		session.close();
		return listemp;
	}
	@Override
	public boolean deleteemp(Employee empl) {
		sessionfactory.getCurrentSession().delete(empl);
		return true;
	}
	@Override
	public Employee getid(int id) {
		Session session=sessionfactory.openSession();
		Employee emp=session.get(Employee.class, id);
		session.close();
		return emp;
	}
	
	
}
	