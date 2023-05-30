package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//xpath: address of the element in the HTML DOM
		//2 types of xpath:
		//1. absolute xpath: absolute address of the element in the HTML DOM
			//html/body/div/div[2]/div/ul/li[2]/input
		//2. relative/custom xpath: 
			//xpath functions
			//xpath properties
			//xpath axes
		
		// double // -> direct + indirect child elements
		// single / -> direct child elements
		
		//htmltag[@attr='value']
		//input[@id='input-email']
		//input[@name='email']
		//input[@value='Login']
		//img[@title='naveenopencart']
		driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();
		
		//htmltag[@attr1='value' and @attr2='value']
		//img[@title='naveenopencart' and @alt='naveenopencart']
		//input[@type='text' and @name='firstname']
		//input[@type='text' and @name='firstname' and @placeholder='First Name']
		
		//text(): label, header, link, span
		//htmltag[text()='value']
		//a[text()='Login']
		//a[text()='Terms & Conditions']
		//h1[text()='Register Account']
		//span[text()='business impact.']
		//label[text()='First Name']
		
		//contains() with attributes:
		//htmltag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//a[contains(@href,'account/forgotten')]
		
		//htmltag[contains(@attr1,'value') and contains(@atrr2,'value')]
		//input[contains(@placeholder,'E-Mail') and contains(@id,'email')]
		
		//contains with first attr but no contains with second attr:
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @id='input-email']
		//input[@id='input-email' and contains(@placeholder,'E-Mail')]
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//a[contains(text(),'Delivery')]
		
		//div[contains(text(),'Warning')]
		//div[contains(text(),'No match for E-Mail Address and/or Password')]
		//p[contains(text(),'By creating an account you will be able to shop faster')]
		
		//contains() with text() and contains with @attr:
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Terms') and contains(@href,'information')]
		
		//contains() with text() and no contains with @attr:
		//a[contains(text(),'Account') and @class='list-group-item']
		
		//start-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@placeholder,'E-Mail')]
		
		//ends-with() in xpath? -- NO
		
		//index:
		// (//input[@class='form-control'])[1]
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("naveen");
		// (//input[@class='form-control'])[position()=1]
		
		//last():
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-(last()-1)]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-(last()-1)]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[1]
		
		//option[normalize-space()='India']
		
		
		//or in css:
		
		
		//not in css:
		
		
		//comma in css:
		// input#username, input#password, input#remember, button#loginBtn
		
		
		
	}

}
