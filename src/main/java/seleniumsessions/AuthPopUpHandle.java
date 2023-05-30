package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		
		String username = "admin";
		String password = "admin";
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(1000);
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
	}

}
