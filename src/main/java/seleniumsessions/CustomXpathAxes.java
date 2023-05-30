package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		//parent to child: 
		//direct --> parent/child
		//div[@class='private-form__input-wrapper']/input[@id='username']
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		//form[@id='hs-login']//child::div -- indirect + direct
		//form[@id='hs-login']/child::div -- direct
		
		//form[@id='hs-login']/div -- 8
		//form[@id='hs-login']//div -- 20 
		//form[@id='hs-login']//input[@id='username']
		
		//indirect + direct --> parent//child
		
		//child to parent: backward traversing in xpath:
		//input[@id='username']/parent::div
		//input[@id='username']/../../../../../../../../../..
		//input[@id='username']/ancestor::div
		
		//sibling:
		//1. preceding-sibling
		//input[@id='input-email']/preceding-sibling::label
		
		
		//2. following-sibling
		//label[@for='input-email']/following-sibling::input[@id='input-email']
		
		
		//div[text()='Get to Know Us']/following-sibling::ul//a
		//div[text()='Make Money with Us']/following-sibling::ul//a
		
		getColumnValues("Get to Know Us");
		getColumnValues("Make Money with Us");

		
	}
	
	public static void getColumnValues(String columnName) {
		System.out.println("------pring the values for -----" + columnName);
		List<WebElement> columnValues = driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		for(WebElement e : columnValues) {
			String text = e.getText();
			System.out.println(text);
		}
	
	}

}
