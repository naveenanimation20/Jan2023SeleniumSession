package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {

	@Test(priority = 1)
	public void searchTest() {
		System.out.println("test - search test");
	}

	@Test(priority = 2)
	public void addToCartTest() {
		System.out.println("test - addToCart test");
	}

	@Test(priority = 3)
	public void paymentTest() {
		System.out.println("test - payment test");
	}

	@Test()
	public void aTest() {
		System.out.println("a test");
	}

	@Test()
	public void bTest() {
		System.out.println("b test");
	}

}

