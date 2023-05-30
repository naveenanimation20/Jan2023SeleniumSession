package seleniumsessions;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. valid - only for chrome - local
		//ChromeDriver driver = new ChromeDriver();
		
		//2. valid -- not recommended
		//SearchContext driver = new ChromeDriver();
		
		//3. valid -- recommended -- local
		//WebDriver driver = new ChromeDriver();
		
		
		//4. valid -- recommended - local
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. valid --- recommended -- remote -- other machine, GRID, Cloud - LT, BrowserStack, AWS
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
//		//capabilities = chrome, 109
		
		//6. valid - not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		
		//7. valid -- but only for chromium based browsers -- edge, chrome
//		ChromiumDriver driver = new ChromeDriver();
//		ChromiumDriver driver1 = new EdgeDriver();

		
		//8. invalid
		//RemoteWebDriver driver = new ChromiumDriver();
		
		
		
		
		
		
		
	}

}
