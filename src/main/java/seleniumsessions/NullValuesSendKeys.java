package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.stream.Collectors;


public class NullValuesSendKeys {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.findElement(By.id("input-email")).sendKeys(null);
		

		String input = "This is an example string";
        StringBuilder vowels = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                vowels.append(c);
            }
        }

        System.out.println(vowels.toString());
    
		    
		

		
	}

}
