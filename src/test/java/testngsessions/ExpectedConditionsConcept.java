package testngsessions;

import org.testng.annotations.Test;

public class ExpectedConditionsConcept {
	
	
	//testng/Junit -- java
	//pytest/unittest -- python
	//Nunit -- C#
	//PhpUnit -- PHP
	//Mocha/Jasmine -- chai -- JS
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageTest() {
		System.out.println("homePageTest");
		int i = 9/0;
	}
	

}
