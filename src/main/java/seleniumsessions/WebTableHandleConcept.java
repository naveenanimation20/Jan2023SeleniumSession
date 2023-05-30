package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandleConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);

		//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']
//		selectContact("Ali khan");
//		selectContact("deepti gupta");
		
		selectMultipleSameContacts("Ali khan");
		String contactName = getContactCompanyName("deepti gupta");
		System.out.println(contactName);

	}
	
	public static void selectContact(String contactName) {
		
		driver
			.findElement
						(By.xpath("//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
								.click();
	}
	
	
	public static void selectMultipleSameContacts(String contactName) {
		List<WebElement> contactsChecks = 
				driver	
				.findElements
					(By.xpath("(//a[text()='"+contactName+"'])/parent::td/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : contactsChecks) {
			e.click();
		}
		
	}
	
	
	public static String getContactCompanyName(String contactName) {
		return driver
			.findElement(By.xpath("//a[text()='"+contactName+"']/parent::td/following-sibling::td/a[@context='company']"))
				.getText();
	}
	
	
	
	
	

}
