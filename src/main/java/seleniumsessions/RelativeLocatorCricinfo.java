package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorCricinfo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/gujarat-titans-vs-rajasthan-royals-23rd-match-1359497/full-scorecard");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Shubman Gill']"));
		
		String wkTakerName = driver
			.findElement(with(By.cssSelector(".ds-flex.ds-cursor-pointer.ds-items-center"))
						.toRightOf(ele)).getText();
		
		System.out.println(wkTakerName);
		
	}
	

}
