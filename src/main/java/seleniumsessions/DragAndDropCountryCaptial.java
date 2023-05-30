package seleniumsessions;

import java.awt.Color;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCountryCaptial {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		dragCapitals("Oslo", "Norway");
		dragCapitals("Stockholm", "Sweden");
		dragCapitals("Washington", "United States");
		dragCapitals("Seoul", "South Korea");
		dragCapitals("Rome", "Italy");
		dragCapitals("Madrid", "Spain");
		dragCapitals("Copenhagen", "Denmark");
		
		Thread.sleep(3000);
		moveCapitalsBack();
		Thread.sleep(3000);

				
//		//-ve use cases:
		dragCapitals("Rome", "Sweden");
		dragCapitals("Stockholm", "Spain");
		dragCapitals("Washington", "South Korea");
		dragCapitals("Seoul", "United States");
		dragCapitals("Oslo", "Norway");
		dragCapitals("Madrid", "Denmark");
		dragCapitals("Copenhagen", "Spain");

		
		Thread.sleep(3000);		
		moveCapitalsBack();
		Thread.sleep(3000);


		//+ve and -ve
		dragCapitals("Oslo", "Norway");
		dragCapitals("Stockholm", "Sweden");
		dragCapitals("Washington", "United States");
		dragCapitals("Rome", "Italy");
		dragCapitals("Seoul", "United States");
		dragCapitals("Madrid", "Denmark");
		dragCapitals("Copenhagen", "Spain");
		
		moveCapitalsBack();
		
	}
	
	public static void dragCapitals(String capital, String country) {
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[text()='"+capital+"' and contains(@id,'box')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//div[text()='"+country+"']"))).perform();
		act.release(driver.findElement(By.xpath("//div[text()='"+country+"']"))).perform();
		
		String colorEle = driver.findElement(By.xpath("//div[text()='"+capital+"' and contains(@id,'box')]")).getCssValue("backgroundColor");
		System.out.println(colorEle);
		
		//String rgbaString = "rgba(0, 255, 0, 1)";
        String[] rgbaValues = colorEle.replaceAll("\\s+", "")
                                          .replace("rgba(", "")
                                          .replace(")", "")
                                          .split(",");
        int r = Integer.parseInt(rgbaValues[0]);
        int g = Integer.parseInt(rgbaValues[1]);
        int b = Integer.parseInt(rgbaValues[2]);
        int a = (int) (Float.parseFloat(rgbaValues[3]) * 255);
        Color color = new Color(r, g, b, a);
        String colorString = "#" + Integer.toHexString(color.getRGB()).substring(2);
        System.out.println("Equivalent color string: " + colorString);
        
        if(colorString.equals("#00ff00")) {
        	System.out.println("Correct drag-drop Done: " + capital + ":" + country);
        }
        else {
        	System.out.println("In-Correct drag-drop Done: " + capital + ":" + country);

        }
	}
	
	
	public static void moveCapitalsBack() {
		List<WebElement> capitalsList = driver.findElements(By.cssSelector("div#countries div.dragableBox"));
		if(capitalsList.size()>0) {
			System.out.println("time to move back all the capitals");
			Actions act = new Actions(driver);
				for(WebElement e : capitalsList) {
					act.dragAndDrop(e, driver.findElement(By.id("capitals"))).perform();
				}
		}
		
	}
	
	

}
