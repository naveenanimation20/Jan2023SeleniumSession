package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> handlesList = new ArrayList<String>(handles);

		String parentWindowID = handlesList.get(0);
		String childWindowID = handlesList.get(1);

		// switching work:
		driver.switchTo().window(childWindowID);
		System.out.println("child window url : " + driver.getCurrentUrl());// twitter url
		driver.close(); // close child window

		driver.switchTo().window(parentWindowID);// back to parent window
		System.out.println("parent window url : " + driver.getCurrentUrl());// orangehrm url

		//driver.quit();// close parent window

	}

}
