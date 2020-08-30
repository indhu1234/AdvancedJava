package task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanWiring  
{
   public static void main(String[] args) 
   {
	ApplicationContext app=new ClassPathXmlApplicationContext("config.xml");
	Account A=(Account) app.getBean("acc");
	System.out.println("Values  ");
	System.out.println(A.getAccnum());
	System.out.println(A.getAcctype());
	System.out.println(A.getBalance());
}
}
