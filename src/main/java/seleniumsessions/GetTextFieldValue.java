package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("naveentesting@gmail.com");
		String text = emailId.getAttribute("value");
		System.out.println(text);
		
		
	}

}
