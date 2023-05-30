package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverLaunch {

	public static void main(String[] args) {

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		WebDriver driver1 = new ChromeDriver(co);

		driver.get("https://www.google.com");
		driver1.get("https://www.amazon.com");
		
		//admin
		//user
		
		driver = driver1;
		
		System.out.println(driver.getTitle());
		
	}

}
