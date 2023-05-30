package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameMethodsConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		List<WebElement> frameList = driver.findElements(By.tagName("frame"));
		System.out.println(frameList.size());
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}

}
