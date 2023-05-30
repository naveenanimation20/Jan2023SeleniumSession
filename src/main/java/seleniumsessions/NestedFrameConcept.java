package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
//		driver.switchTo()
//				.frame("pact1")
//						.switchTo().frame("pact2")
//								.switchTo().frame("pact3")
//										.findElement(By.id("glaf")).sendKeys("Riya");
		
		
		
		
//		driver.switchTo()
//		.frame("pact1")
//				.switchTo().frame("pact2")
//								.findElement(By.id("jex")).sendKeys("Ankit");
		
		
		
		driver.switchTo()
		.frame("pact1")
				.switchTo().frame("pact2")
						.switchTo().frame("pact3")
								.findElement(By.id("glaf")).sendKeys("Riya");
								
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Ankit");;
		

		//Nested iframes/frames
		//Browser
			//Page -- elements
				//iframe1 -- elements
					//iframe2 -- elements
						//iframe3 -- elements
						
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("Tom");
//				
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("Peter");
//		
//		driver.switchTo().frame("pact3"); //driver -- pact 3
//		driver.findElement(By.id("glaf")).sendKeys("Naveen");

//		driver.switchTo().parentFrame(); //sel 4.x -- driver --> pact2
//		driver.findElement(By.id("jex")).sendKeys("Riya");
//		
//		driver.switchTo().parentFrame(); // driver --> pact1
//		driver.findElement(By.id("inp_val")).sendKeys("Ankit");
		
		//pact 3 to pact 1
		
//		driver.switchTo().parentFrame(); //pact2
//		driver.switchTo().parentFrame(); //pact 1
//		driver.findElement(By.id("inp_val")).sendKeys("Testing");
		
		//driver is on pact1 ---> main page (default content)
		
//		driver.switchTo().defaultContent(); //pact1 to page
//		
//		
//		String header = 
//				driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default")).getText();
//		System.out.println(header);


		//page to frame
		//f1 to f2
		//f2 to f3
		//f3 to f2
		//f2 to f1
		//f1 to f3 -- NO
		//f1 to f2  to f3 -- yes
		//f3 to default content ---> page
		//page --> f1 -> f2
		//f2 to main page --> yes with default content
		//page --> f3 -- NO
		//Page --> f2 --> NO
		//Page --> f1 --> f2 --> f3 ---> yes
		
		
		
	}

}
