package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SessionID {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);//launch chrome
		//sid=123
		
		driver.get("https://www.google.com");//enter url
		String title = driver.getTitle();//get the title
		System.out.println(title);//Google
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit();//close the browser
		
		driver.close();//close the browser, sid = 123
		
		driver = new ChromeDriver(co);//launch chrome
		//sid=456
		driver.get("https://www.google.com");//enter url
		//sid=456
		
		System.out.println(driver.getTitle());//title=Google SID=456
		//NoSuchSessionException: invalid session id
		
//		BT - wd d = new CD()//123
//		test -- //123
//		AT -- driver.quit, null
		
		
		

	}

}
