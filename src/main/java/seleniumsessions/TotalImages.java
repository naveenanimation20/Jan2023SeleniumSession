package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println("total images:" + imagesList.size());
//		
//		for(WebElement e : imagesList) {
//			String altValue = e.getAttribute("alt");
//			System.out.println(altValue);
//		}	
		
		By image = By.tagName("img");
		By links = By.tagName("a");
		
		int imagesCount = getElementsCount(links);
		if(imagesCount>=200) {
			
		}
		
		List<String> imgesAttrList = getElemenetsAttributeValue(image, "alt");
		if(imgesAttrList.contains("Computer mice")) {
			System.out.println("PASS");
		}
		
		getElemenetsAttributeValue(links, "href");
		
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getElemenetsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();//0
		
		for(WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			//System.out.println(attrValue);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
