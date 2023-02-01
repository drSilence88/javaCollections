package section3JShellStart;

import java.math.BigDecimal;

public class StudentRunner {
	
	public static void main(String[] args) {
//		int[] marks = {99, 98, 100}; // Refactor -> Inline...
//		Student student = new Student("Ranga", new int[] {99, 98, 100}); // Inline...
		
		Student student = new Student("Ranga", 99,98,100);
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks " + number);
		
		int totalSum = student.getTotalSumOfMarks();
		System.out.println(totalSum);
		
		int maximum = student.getMaximumMark();
		System.out.println(maximum);
		
		int minimum = student.getMinimumMark();
		System.out.println(minimum);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println(average);

		System.out.println(student);
		
		
	}
}
