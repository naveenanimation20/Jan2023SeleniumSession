package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By forgotPwdLink = By.linkText("Forgot Password?");
		By pricing = By.linkText("Pricing");

		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickElementWhenReady(forgotPwdLink, 10);

//		String title = waitForTitleIsAndCapture("Log In", 5);
//		System.out.println(title);

		// url:
		eleUtil.clickElementWhenReady(pricing, 10);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if (wait.until(ExpectedConditions.urlContains("pricing.html"))) {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}

	}

	public static String waitForURLContainsAndCapture(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present within the given timeout : " + timeOut);
			return null;
		}
	}

	public static String waitForURLAndCapture(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present within the given timeout : " + timeOut);
			return null;
		}
	}

	public static String waitForTitleIsAndCapture(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("title is not present within the given timeout : " + timeOut);
			return null;
		}
	}

	public static String waitForFullTitleAndCapture(String titleVal, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("title is not present within the given timeout : " + timeOut);
			return null;
		}
	}

}
