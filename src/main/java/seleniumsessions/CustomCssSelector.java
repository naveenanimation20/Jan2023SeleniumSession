package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		
		//css selector: cypress, PW, WDIO
		//page: html + css
		
		//id:
		//#id
		//tag#id
		//#loginBtn
		//button#loginBtn
		//class:
		//.classname
		//.login-email
		//input.login-email
		
		//#id.class
		//tag#id.class
		//tag.class#id
//		input#username.form-control
//		#username.form-control
//		.form-control#username
//		input.form-control#username
		
		//c1 c2 c3
		//.c1.c2.c3
		//tag.c1.c2.c3
		//tag.c1.c2.c3#id
		//tag#id.c1.c2.c3
		//.form-control.private-form__control.login-email
//		input.form-control.private-form__control.login-email
//		input.form-control.private-form__control.login-email#username
//		input#username.form-control.private-form__control.login-email
		//.form-control.login-email
		
		
		By.xpath("//input[@class='form-control private-form__control login-email']");//valid
		By.cssSelector("input.form-control.private-form__control.login-email");//valid
		By.xpath("//input[@class='form-control']");//not valid
		By.className("login-email");//valid
		//By.className("form-control private-form__control login-email");//not valid
		
		//other attribute:
		// tag[attr = 'value']
		// input[type='email'] -css
		//input[@type='email'] -xpath
		// input[id='username']
		// input[placeholder='First Name']
		
		// tag[attr1='value'][attr2='value'] --css
		// input[type='text'][name='firstname']
		// input[type='text'][name='firstname'][placeholder='First Name']
		// input[type][name][placeholder='Search']
		
		//tag[@attr1='value' and @attr2='value'] --xpath
		//input[@type and @name and @placeholder]--xpath
		//a[@href]		--xpath
		
		
		// input[placeholder='First Name']#input-firstname
		// input#input-firstname[placeholder='First Name']
		
		//text in css: not applicable
		
		//contains in css:
		// tag[attr*='value']
		// input[id*='firstname']
		
		// input[placeholder*='Name'] --contains
		
		// input[placeholder*='First'][type='text'][class*='form-control']
		// input[type='email'][class*='login-email']
		// input[class*='login-email'] ---css
		// input[contains(@class,'login-email')]--xpath
		
		//starts-with in css:
		//tag[attr^='value'] --starts-with
		
		//ends-with in css:
		//tag[attr$='value'] --ends-with
		// input[id$='name']
		
		//parent to child:
		// parent tag child tag --> direct + indirect child elements
		// select#Form_getForm_Country option
		// form#hs-login div --20
		
		// parent tag > child tag --> direct child elements
		// form#hs-login > div --8
		// form#hs-login  input#username
		
		//child to parent: backward traversing is not possible with CSS
		
		//following sibling in css: 
	//	label[for='input-email'] + input#input-email    --> + for immediate sibling
	//  select#Form_getForm_Country > option[value='Afghanistan'] ~ option	
		
		//preceding sibling in css: not possible with CSS
		
		//indexing in css:
//		select#Form_getForm_Country option:first-child
//		select#Form_getForm_Country option:last-child
//		select#Form_getForm_Country  option:nth-child(5)
//		select#Form_getForm_Country  option:nth-last-child(2)
//		select#Form_getForm_Country  option:nth-child(odd)
//		select#Form_getForm_Country  option:nth-child(even)
//		select#Form_getForm_Country  option:nth-child(n+4)
//		select#Form_getForm_Country  option:nth-child(3n-1)
//		select#Form_getForm_Country  option:nth-child(4n)
		
		
		//comma in css:
		List<WebElement> mandatoryEles = 
				driver.findElements(By.cssSelector("input#username, input#password, input#remember, button#loginBtn"));
		
		if(mandatoryEles.size() == 4) {
			System.out.println("mandatory elements are present --- PASS");
		}
		
		//not in css:
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		// input.form-control.private-form__control:not(input#username)
		
		
		//               xpath        vs           css:
//		1. syntax:        hard						easy
//		2. text            yes						no
//		3. AND				yes						yes
//		4. OR				yes						yes, comma
//		5. forward: 		yes						yes
//		6. backward: 		yes						no
//		7. forwardsibling:	yes						yes
//		8. backwardsibling: yes						no
//		9. index:           yes	                    yes
//		10. capture grp:	yes						no
//		11. contains:		yes						yes
//		12. start-with		yes						yes
//		13. ends-with		no						yes
//		14. normalize-space yes						no
//		15. first/last		yes						yes
//		16. parent to child	yes						yes
//		17. child to parent	yes						no
//		18. performance:	good					slightly better than xpath/good
//		19. webtable: 		easy					limited	
		
		
		//html/body/div/ul/li/input
		// html > body > div > ul > li input
		
		// (//div[text()='Dominic.Chase']/parent::div/following-sibling::div)[last()]//i[contains(@class,'bi-trash')]
	}

}
