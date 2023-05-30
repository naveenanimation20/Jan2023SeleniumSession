package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//chrome//firefox/safari/edge
		
		//chrome 111.x
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
//		
//		ChromeDriver driver = new ChromeDriver(co);
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		//Automation Steps:
		WebDriver driver = new ChromeDriver(co);//launch safari
		
		driver.get("https://www.amazon.com");//enter url
		String title = driver.getTitle();//get the title
		System.out.println(title);
		
		//verification point/checkpoint/act vs exp result
		if(title.contains("Amazon.com")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		//Automation Steps + verification point = automation testing
		
		//driver.quit();//close the browser
		//driver.close();//close the browser
		
		
	}

}
