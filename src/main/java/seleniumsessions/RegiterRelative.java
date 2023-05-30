package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;


public class RegiterRelative {

		static WebDriver driver;
		
		public static void main(String[] args) {

			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='No']"));

			
			driver.findElement(with(By.xpath("//input[@value=0 and @type='radio' and @name='newsletter']")).near(ele)).click();


			
	}

}
