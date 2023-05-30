package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterDoubt {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		clickFooterElement("About Us");
		System.out.println(driver.getTitle().equals("About Us"));
		
		clickFooterElement("Contact Us");
		System.out.println(driver.getTitle().equals("Contact Us"));

	}

	public static void clickFooterElement(String footerLinkText) {
		driver.findElement(By.linkText(footerLinkText)).click();
	}

}
