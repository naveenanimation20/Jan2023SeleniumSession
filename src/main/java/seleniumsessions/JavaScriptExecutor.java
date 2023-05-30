package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		jsUtil.generateAlert("this is my js alert");
		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText.contains("Task & Event Tracking"));
//		System.out.println(pageText.contains("Marketing Campaigns"));
		
		//jsUtil.zoomChromeEdge("400.0");
		//responsive testing --> 50% 100% 60% 400%
		
		//WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//		jsUtil.drawBorder(login);
		
		//WebElement form = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(form);
		
		//jsUtil.flash(form);
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Drugstore']"));
		jsUtil.scrollIntoView(ele);
		
		
		
		
	}

}
