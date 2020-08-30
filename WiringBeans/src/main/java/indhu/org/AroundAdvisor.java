package indhu.org;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor
{

	public Object invoke(MethodInvocation invocation) throws Throwable 
    {
		 Object obj;  
	        System.out.println("additional concern before actual logic");  
	        obj=invocation.proceed();  
	        System.out.println("additional concern after actual logic");  
	        return obj;  	
	}
	

}
