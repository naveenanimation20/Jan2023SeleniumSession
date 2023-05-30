package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsSendKeysClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		doActionsSendKeys(emailId, "test@gmail.com");
		doActionsClick(loginBtn);
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(emailId), "test@gmail.com").build().perform(); //click on it, then sendkeys
//		act.sendKeys(driver.findElement(password), "test@123").build().perform();
//		act.click(driver.findElement(loginBtn)).build().perform();
		
		
		//Actions Send Keys:
		//move to that element internally	
		//click on it -- it will click on middle of the element
		//enter the value
		
		//WebElement sendKeys:
		//enter the value
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	

}
