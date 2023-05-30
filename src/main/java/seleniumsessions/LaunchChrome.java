package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome {

	public static void main(String[] args) {
		
		//chrome 111.x
		//selenium 4.8.2--> 4.8.3

//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
