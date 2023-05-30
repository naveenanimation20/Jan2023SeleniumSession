package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryTest {
	
	@FindBy(name = "q")
	static WebElement search;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		PageFactory.initElements(driver, PagefactoryTest.class);		
		search.sendKeys("naveen automation labs");
		
	}

}
