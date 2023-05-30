package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {

		// above
		// left<---ele --> right
		// below
		// near -- 100 px
		// Sel 4.x

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement ele = driver.findElement(By.linkText("Burlington, Canada"));

		// right of ele -->
		String rightScore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightScore);

		// left of ele-->
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);

		// below of ele--->
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);

		// above of ele--->
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		//near of ele:
		String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
	}

}
