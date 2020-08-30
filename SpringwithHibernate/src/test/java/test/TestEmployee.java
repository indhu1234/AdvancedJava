package test;

import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Indhu.Employee;
import Indhu.employeeservices;
import junit.framework.TestCase;

public class TestEmployee extends TestCase 
{
	static employeeservices employeeService;
	@BeforeClass
   public static void testfirst()
   {
	  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	  context.scan("Indhu");
	  context.refresh();
	  employeeService=(employeeservices) context.getBean("employeeService");
	  System.out.println("Connection was established");
   }
	
	@Test
	public void testaddemp()
	{
		System.out.println("Inserting Record from test case");
		Employee emp=new Employee();
		emp.setName("");
		emp.setSalary(40000);
		assertTrue("Problem",employeeService.addEmployee(emp));
	}
	
}
