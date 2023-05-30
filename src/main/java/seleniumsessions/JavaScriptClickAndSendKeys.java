package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.name("persistent"));
		//1. ele.click();
		
//		2. Actions act = new Actions(driver);
//		act.click(ele).build().perform();
		
		//3. JS click 
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.clickElementByJS(ele);
		
		jsUtil.sendKeysUsingWithId("login-username", "naveen@yahoo.com");
		
		
	}

}
