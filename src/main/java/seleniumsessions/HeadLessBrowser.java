package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//testing is happening behind the scene
		//faster
		//can be helpful in linux machine
		//can be used with CI CD Pipeline - Jenkins, GithubActions, AWS
		
		//might not work for complex app - html, menu items
		//might not work for internal navigations, mouse hover, mouse movement
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		
//		
//		co.addArguments("--headless");
//		co.addArguments("--incognito");
//		ChromeDriver driver = new ChromeDriver(co);
		
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
	}

}
