package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class StaleElementRefExceptionConcept {
	
	
	@FindBy(id = "input-email")
	static WebElement userId;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(emailId, "test@gmail.com");
		driver.navigate().refresh();
		elUtil.doSendKeys(emailId, "naveen@gmail.com");

		//Page Factory -- class
		
		//userId.sendKeys(test);
		
		
//		WebElement ele = driver.findElement(By.id("input-email"));
//		ele.sendKeys("test@gmail.com");
//
//		driver.navigate().refresh(); //back/forward
//		
//		ele = driver.findElement(By.id("input-email"));
//		
//		ele.sendKeys("naveen@gmail.com");
		
		
		//web element + action
		//By locator --> web element -- action
		
		

		//Thread.sleep(5000);
//		try {
//			ele.clear();
//			ele.sendKeys("naveen@gmail.com");
//		} catch (StaleElementReferenceException e) {
//			ele.clear();
//			ele.sendKeys("naveen@gmail.com");
//		}
		// StaleElementReferenceException: stale element reference: element is not
		// attached to the page document

	}

}
