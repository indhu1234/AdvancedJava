package com.example.RestApiDemo;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiDemoApplicationTests {

	UserService userserv;
	/*@Test
	void contextLoads() {
	}*/
	
	@Test
	public void testallusers()
	{
		User user=new User(101,"Banu");
		user.setUserid(100);
		user.setUsername("Akila");
		List<User> li=userserv.getAllUsers();
		//assertTrue("Problems",userserv.getAllUsers());
		System.out.println("Finished");
	}

}
