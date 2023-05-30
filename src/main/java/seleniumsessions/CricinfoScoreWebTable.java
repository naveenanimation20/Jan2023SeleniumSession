package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoScoreWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
	
		Thread.sleep(4000);	
	
		String wkTkrName = getWicketTakerName("Manish Pandey");
		System.out.println(wkTkrName);
		
		System.out.println(getPlayerScoreCardsList("Manish Pandey"));
	
	}
	
	public static String getWicketTakerName(String playerName) {
		return driver
			.findElement(
						By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td//span"))
								.getText();
	}
	
	public static List<String> getPlayerScoreCardsList(String playerName) {
		List<WebElement> scoreList = 
		driver
			.findElements
				(By.xpath("//span[text()='"+playerName+"']/ancestor::td//following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scoreValList = new ArrayList<String>();
		for(WebElement e : scoreList) {
			String text = e.getText();
			scoreValList.add(text);
		}
		return scoreValList;
	}
	
	
	
	

}
