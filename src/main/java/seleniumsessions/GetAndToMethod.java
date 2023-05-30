package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAndToMethod {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		//driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.google.com");
		
		//driver.navigate().to("https://www.amazon.com");
		try {
			driver.navigate().to(new URL("https://www.amazon.com"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.get("https://www.amazon.com");

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
	}

}
