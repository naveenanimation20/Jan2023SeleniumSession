package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String s = "    hello         world     ";
		System.out.println(s.replaceAll("\\s", ""));

		ArrayList<String> Cities = new ArrayList<String>(
				Arrays.asList("Chennai", "Bangalore", "Hyderabad", "Kochi", "NaviMumbai", "Bombay", "Delhi"));
		// Write a Java program to extract a portion of an array list
		System.out.println(Cities);

		System.out.println(Cities.subList(0, 4));

		String st = "Welcome to the world";
		String arr[] = st.split(" ");
		System.out.println(arr[1]);

		System.out.println(st.indexOf("to"));
		System.out.println(st.substring(st.indexOf("to"), st.indexOf("to") + 3));

		String test = "hi this is my java code i am so happy";
		System.out.println(test.indexOf("i"));// 1
		System.out.println(test.indexOf('i', test.indexOf("i") + 1));// 5
		System.out.println(test.indexOf('i', test.indexOf('i', test.indexOf("i") + 1) + 1));// 8
		System.out.println(test.indexOf('i', test.indexOf('i', test.indexOf('i', test.indexOf("i") + 1) + 1) + 1));// 24

		// loop: give me all the occurrences of i?

		String msg = "your admin id is 12345";
		String[] ar = msg.split(" ");
		boolean flag = false;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i].equals("transaction")) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("transaction success");
		} else {
			System.out.println("not success");
		}
		
		String input = "₹9,900.00";
        String result = input.replaceAll("[₹,]", "");
        System.out.println(result);//9900.00

	}

}
