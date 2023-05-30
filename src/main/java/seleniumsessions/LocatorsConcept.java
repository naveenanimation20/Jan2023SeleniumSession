package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. id: unique attribute
		
		//2. name: not unique attribute
//		driver.findElement(By.name("firstname")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.name("lastname")).sendKeys("naveen@123");
//		driver.findElement(By.name("agree")).click();
		
//		By fn = By.name("firstname");
//		By check = By.name("agree");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "naveen");
//		eleUtil.doClick(check);
		
		//3. class name: not unique attribute
		//driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		
		//4. xpath: its not an attribute. its the address of the element in HTML DOM.
		//can be unique/can be duplicate
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("naveen");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		
		//5. css selector: its not an attribute.
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("naveen");
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		//xpath vs css??
		
		//6. linkText: only for links:
		//can be duplicate
		//can be blank
		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partialLinkText: only for links:
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//Forgotten Password
		//Forgotten UserId
		
		//8. tag Name: html tag:
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		if(header.equals("New Customer")) {
			System.out.println("PASS");
		}
		
		
//		String text = driver.findElement(By.linkText("Recurring payments")).getText();
//		System.out.println(text);
		
		By rp = By.linkText("Recurring payments");
		String text = doGetElementText(rp);
		System.out.println(text);
	}
	
	
	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	
	

}
