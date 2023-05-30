package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationWithDoWhile {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		
		//single selection:
        boolean countryFound = false;
        do {
            // Check if the country is present on the current page
            if (driver.findElements(By.xpath("//td[text()='Naveen']")).size() > 0) {
                // selectCountry
                selectCountry("Naveen");
                countryFound = true;
            } else {
                // pagination logic:
                // click on next link:
                WebElement next = driver.findElement(By.linkText("Next"));

                if (next.getAttribute("class").contains("disable")) {
                    System.out.println("pagination is over...country is not found...");
                    break;
                }

                next.click();
                Thread.sleep(1500);
            }

        } while (!countryFound);
		
		
		
		
	}
	
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
