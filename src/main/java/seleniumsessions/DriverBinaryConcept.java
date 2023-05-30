package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverBinaryConcept {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		//SID =123
		//launch browser
		
		Thread.sleep(5000);
		
		//driver.quit();
		//driver.close();
		
	}

}
