package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void homePageTest() {
		System.out.println("homePageTest");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println("searchTest");
	}

	@Test(dependsOnMethods = "searchTest")
	public void cartTest() {
		System.out.println("cartTest");
	}
	
	//AAA Rule -- Arrange, act, assertion
	
	//test cases should be independent
	//CRUD - 
	//createUserTest --> create a new user -- assert
	//getUserTest --> create a new user(xxxxx) + get the same user(xxxxx) -- assert
	//invalid - getUserTest --> use the same userid(124) + get the same user -- assert --> 123 -- QA ---> stg --123X
	//updateUserTest --> create new user(xxxx) + get the same user (xxxxx) -- update user (xxxx) -- assert
	//deleteUserTest --> create new user(xxxx) + get the same user (xxxxx) -- delete the user (xxx) -- assert
	
	//C - R - U - D 
	
	
	

}
