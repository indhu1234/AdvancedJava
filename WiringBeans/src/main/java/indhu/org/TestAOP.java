package indhu.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestAOP 
{
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("Configuration.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	  
	    /*A a=factory.getBean("proxy",A.class);  
	    a.m(); */
	    
	    Validator v=factory.getBean("proxy",Validator.class);  
	    try{  
	    v.validate(12);  
	    }
	    catch(Exception e)
	    {e.printStackTrace();  
	     }  
	    
	}  
}
