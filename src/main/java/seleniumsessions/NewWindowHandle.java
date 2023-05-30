package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		String parentWindowId = driver.getWindowHandle();
		
		//sel 4.x:
		//driver.switchTo().newWindow(WindowType.TAB); //open a blank tab
		
		driver.switchTo().newWindow(WindowType.WINDOW); //open a new window
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());		
		
	}

}
