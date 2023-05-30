package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		//wait types:
		//1. static wait: Thread.sleep(10000) - wait for 10 secs --JAVA
		//2. Dynamic wait: total time out = 10 secs --> found 2 secs -->
		///rest of 8 secs will be ignored/cancelled
		//10 secs -- not found after 10 secs also---NSE
		
		//2.a: Implicitly Wait
		//2.b: Explicit Wait
				//i. WebDriverWait
				//ii. FluentWait
		
		//WebDriverWait(c) -extends-->       FluentWait (c)  ---implements--> Wait(I) => until();
		//no public methods			            //until(){}
		//+inherit fluentwait class	methods	    //+ other methods()
		
		
		//webdriver BiDi -- web socket 
		//webdriver bidi protocol -- w3c standard --
		//cypress, PW, selenium WD ---> webdriver bidi protocol -- browser -- sel conf
		
		
		
		
		
		
	}

}
