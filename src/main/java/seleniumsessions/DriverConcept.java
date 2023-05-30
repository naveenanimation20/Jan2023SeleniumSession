package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConcept {

	public static void main(String[] args) {

		//4.5.0
		
		//windows:
		//System.setProperty("webdriver.gecko.driver", "c:\\Documents\\seleniumdrivers\\geckodriver.exe");

		
		//mac:
		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Documents/seleniumdrivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
//		Exception in thread "main" java.lang.IllegalStateException: 
//		The path to the driver executable 
//		The path to the driver executable must be set by the webdriver.gecko.driver system property; 
//		for more information, see https://github.com/mozilla/geckodriver. 
//		The latest version can be downloaded from https://github.com/mozilla/geckodriver/releases

		//browser 80 ---> 80.exe
		//81 ---> 81.exe
		//82  --> 81.exe --> 82.exe 
		//83 --> 83.exe
		
		
		
	}

}
