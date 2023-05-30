package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsScrollingConcept {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
			Actions act = new Actions(driver);
			
//			act.sendKeys(Keys.PAGE_DOWN).build().perform();
//			act.sendKeys(Keys.PAGE_DOWN).build().perform();
//			act.sendKeys(Keys.PAGE_DOWN).build().perform();
//			act.sendKeys(Keys.PAGE_DOWN).build().perform();
//			act.sendKeys(Keys.PAGE_UP).build().perform();
			
			act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform(); //mac
			//act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform(); //windows
			
			//refresh the page:
			act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
			
			
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			String s1 = "Pooja";
			String s2 = "Hegde";
			StringBuffer s3 = new StringBuffer("Testing");
			StringBuilder s4 = new StringBuilder("Automation");

			driver.findElement(By.name("search")).sendKeys(s1 + " "+ s2 + " " + s3 + " " + s4);
			//driver.findElement(By.name("search")).sendKeys(null);
			//IllegalArgumentException: Keys to send should be a not null CharSequence
			
			driver.findElement(By.xpath("//input[@value='Login']")).sendKeys("testing");
			//no exception
			
			driver.findElement(By.id("input-email")).click();//no exception
			
			//disable text field -- send keys
			//disable button -- click on it
		
	}

}
