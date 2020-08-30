package indhu.niit.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootdemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void addstud()
	{
		Student S=new Student();
		S.setName("Ambiga");
		S.setAge(25);
		S.setRegistrationNumber("S122");
		
		
	}
}
