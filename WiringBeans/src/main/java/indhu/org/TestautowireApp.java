package indhu.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestautowireApp 
{
  public static void main(String[] args) {
	  ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
	 // Game FB=(Game) context.getBean("football");
	  Football fball= context.getBean("fb",Football.class);
	  
	   fball.play();
	}
  
   
  
  
  
}
