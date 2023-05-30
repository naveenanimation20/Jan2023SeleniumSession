package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlowSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
		
		String value = "naveenanimation20@gmail.com";
		char val[] = value.toCharArray();
		
		for(char c : val) {
			act.sendKeys(driver.findElement(By.id("input-email")),String.valueOf(c)).pause(500).build().perform();;

		}
		
		
		
	}

}
