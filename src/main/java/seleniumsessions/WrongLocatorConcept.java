package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongLocatorConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//input[@@@@title='Email' and @type==='email]")).sendKeys("test");
		//InvalidSelectorException
		//NoAlertPresentException
		//NoSuchFrameException
		//NoSuchElementException
		//StaleElementReferenceException
		//ElementNotInteractableException
		//NoSuchWindowException
		//TimeoutException
		//ElementClickInterceptedException
		//InvalidArgumentException: invalid argument
		//https://www.selenium.dev/selenium/docs/api/py/common/selenium.common.exceptions.html
		
		
	}

}
