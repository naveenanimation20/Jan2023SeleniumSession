package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsHandling {

	public static void main(String[] args) throws InterruptedException {

		//JS pop ups: Alert Interface
		//1. Alert
		//2. confirm
		//3. prompt
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(4000);
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept(); //click on OK
//		//alert.dismiss();
		
		//
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(4000);
//		Alert alert = driver.switchTo().alert();
//		String alertText  = alert.getText();
//		System.out.println(alertText);
//		alert.accept();
		
		//
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("testautomation");
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		
		
		
		
	}

}
