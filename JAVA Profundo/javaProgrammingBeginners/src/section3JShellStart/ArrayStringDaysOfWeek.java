package section3JShellStart;

import java.util.Arrays;

public class ArrayStringDaysOfWeek {
	public static void main(String[] args) {
		String dayMoreLetters = ""; 
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		for (int i = 0; i < daysOfWeek.length; i++) {
			if(daysOfWeek[i].length() > dayMoreLetters.length()) {
				dayMoreLetters = daysOfWeek[i];
			}
		}		
		System.out.println(dayMoreLetters);
		
		for (int i = daysOfWeek.length -1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
}
