package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(10))
//								.ignoring(NoSuchElementException.class)
//								.ignoring(StaleElementReferenceException.class)
//								.ignoring(ElementNotInteractableException.class)
//								.pollingEvery(Duration.ofMillis(1000))
//								.withMessage("------time out is done...element is not found.....");
//		
//		wait.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
		
		//WDWait with FluentWait Features
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class)
			.pollingEvery(Duration.ofSeconds(1))
			.withMessage("------time out is done...element is not found.....")
			.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
		
		
		//WDWait without FluentWait Features
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
	}
	
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotInteractableException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("------time out is done...element is not found.....");
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	
	
	

}
