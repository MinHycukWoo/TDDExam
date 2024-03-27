package com.example.App;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

	@Test
	void contextLoads() {
		AppApplication classUnderTest = new AppApplication();
		Assertions.assertNotNull("app should have a greeting" , classUnderTest.getGreeting());

	}


	/**
	 * //1+2 = 3
	 * 	//Calculator
	 * -add(x,y) ,
	 * -plus(x,y) ,
	 * -minus(x,y)
	 * -divide(x,y)
	 * //lhs , rhs
	 * lhs operator rhs
	 * lhs = rhs
	 */

}
