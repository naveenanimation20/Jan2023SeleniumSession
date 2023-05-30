package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresentConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		// driver.findElement(By.id("twotabsearchtextbox11")).sendKeys("Macbook");
		// NoSuchElementException
		// ElementNotFoundException -- not in selenium

		By search = By.id("twotabsearchtextbox");
		getElement(search);
	}

	public static WebElement getElement(By locator) {
		WebElement element=null;
		try {
			element = driver.findElement(locator);
			System.out.println("element is found with locator: " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);	
			try {
				Thread.sleep(5000);//static wait  ---> dynamic wait- exp wait
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

}
