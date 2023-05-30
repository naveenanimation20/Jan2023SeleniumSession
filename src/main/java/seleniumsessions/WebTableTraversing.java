package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraversing {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	
		System.out.println("total cols: " + getColumnCount());
		System.out.println("col vals: " + getColumnValues());
		
		System.out.println(getColumnValues().contains("Company"));
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		
//		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
//		String afterXpath = "]/td[1]";
//		
//		for(int row=2; row<=getRowCount(); row++) {
//			String fullXpath = beforeXpath + row + afterXpath;
//			//System.out.println(fullXpath);
//			String text = driver.findElement(By.xpath(fullXpath)).getText();
//			System.out.println(text);
//		}
		
		List<WebElement> tableDataList = driver.findElements(By.xpath("//table[@id='customers']/tbody//td"));
		for(WebElement e : tableDataList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}
	
	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
	}
	
	
	public static List<String> getColumnValues() {
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List<String> colValList = new ArrayList<String>();
		for(WebElement e : columnList) {
			String text = e.getText();
			colValList.add(text);
		}
		return colValList;
	}
	
	//th[text()='Contact']/parent::tr/following-sibling::tr/td[2] -- from the specific column name
	
	

}
