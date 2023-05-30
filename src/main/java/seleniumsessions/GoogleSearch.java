package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void search(String searchKey, By searchLocator, String suggName, By suggestions)
			throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println("total suggestions: " + suggList.size());

		if (suggList.size() > 0) {

			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);
					if (text.contains(suggName)) {
						e.click();
						break;
					}
					else {
						System.out.println("sugg value " + suggName + " is not present");
					}
				}
				else {
					System.out.println("blank values -- but no sugeestions");
					break;
				}
			}
		}
		else {
			System.out.println("no search suggestions found");
		}

	}

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By search = By.name("q");
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		search("macbook", search, "youtube", suggestions);

	}

}
