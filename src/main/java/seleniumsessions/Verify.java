package seleniumsessions;

public class Verify {
	
	
	public static boolean equalValues(String actResult, String expResult) {
		if(actResult.equals(expResult)) {
			System.out.println(actResult + " is equal to " + expResult);
			return true;
		}else {
			System.out.println(actResult + " is not equal to " + expResult);
			return false;
		}
		
	}
	
	public static boolean containValues(String actResult, String expResult) {
		if(actResult.contains(expResult)) {
			System.out.println(actResult + " contains " + expResult);

			return true;
		}
		else {
			System.out.println(actResult + " does not contains " + expResult);
			return false;
		}
		
	}
	

}
