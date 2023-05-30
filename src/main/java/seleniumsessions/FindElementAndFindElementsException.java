package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsException {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.name("search111")).sendKeys("macbook");
		//NoSuchElementException
//		List<WebElement> panelLinks = driver.findElements(By.className("list-group-item1111"));
//		System.out.println(panelLinks.size());
		
		By search = By.name("search");
		if(checkElementIsDisplayed(search)) {
			System.out.println("enter the value");
		}
		
		driver.findElement(By.id("")).isDisplayed();
		if(driver.findElements(By.name("")).size()>0) {
			
		}
		
	}
	
	public static boolean checkElementIsDisplayed(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		if(eleList.size()>0) {
			System.out.println(locator + " element is present on the page");
			return true;
		}
		else {
			return false;
		}
	}
	

}
