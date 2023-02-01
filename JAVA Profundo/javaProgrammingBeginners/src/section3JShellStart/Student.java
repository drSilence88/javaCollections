package section3JShellStart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
	
	private String name;
//	private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<>();

	public Student(String name, int... marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		for(Integer mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i : marks) {
			total += i;
		}
		return total;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
//		int max = 0;
//		Arrays.sort(marks);
//		for (int i = 0; i < marks.length; i++) {
//			max = marks[i];
//		}
//		return max;
		int max = Integer.MIN_VALUE;
		for (int i : marks) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}

	public int getMinimumMark() {
//		// TODO Auto-generated method stub
//		int max = 0;
//		Arrays.sort(marks);
//		for (int i = marks.length; i > 0; i--) {
//			max = marks[i - 1];
//		}
//		return max;
		int min = Integer.MAX_VALUE;
		for (int i : marks) {
			if(min > i) {
				min = i;
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
//		int nums = 0;
//		int average = 0;
//		for (int i = 0; i < marks.length; i++) {
//			nums += marks[i];
//			average = nums/marks.length;
//		}
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 2, RoundingMode.UP);
	}
}
