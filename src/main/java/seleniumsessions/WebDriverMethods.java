package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);//launch chrome
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		
		driver.get("https://www.google.com/");
		
//		String pgSource  = driver.getPageSource();
//		System.out.println(pgSource);
//		
//		System.out.println(pgSource.contains("end customers section"));
		
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		
		
		
	}

}
