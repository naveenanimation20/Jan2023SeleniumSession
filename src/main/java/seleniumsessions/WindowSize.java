package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSize {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		
//		Dimension dim = new Dimension(800, 500);
//		
//		driver.manage().window().setSize(dim);
		driver.manage().window().setSize(new Dimension(1080, 780));
		
		driver.get("https://www.amazon.com");
		
		
		
		
		
	}

}
