package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(3000);
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		//total windows = 5
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(1000);
			
				if(!windowId.equals(parentWindowId)) {
					driver.close();
				}
			
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: "+ driver.getCurrentUrl() ) ;
		

	}

}
