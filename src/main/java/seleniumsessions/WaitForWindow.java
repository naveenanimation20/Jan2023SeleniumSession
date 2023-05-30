package seleniumsessions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickElementWhenReady(twitterLink, 5);
		
		//total windows = 2
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		if(waitForTotalWindows(2, 5)) {
			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles.size());
		}
		
		
		
	}
	
	
	public static boolean waitForTotalWindows(int totalWindowsToBe, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowsToBe));
	}
	

}
