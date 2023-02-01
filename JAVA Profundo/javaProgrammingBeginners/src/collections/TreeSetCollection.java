package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,54,34,12,99));
		System.out.println(numbers);
		
		System.out.println("Number lower than 34 (inclusive 34): " + numbers.floor(34)); //inclusive 40
		System.out.println("Number lower than 34: " + numbers.lower(34)); //exclusive
		System.out.println("Number lower than 54: " + numbers.ceiling(54)); //upper inclusive 
		System.out.println("Number lower than 54: " + numbers.higher(54)); //exclusive 54
		System.out.println("Number between 34, 54: " + numbers.subSet(34, 54)); //inclusive 34, exclusive 54
		System.out.println("Number between 34, 54: " + numbers.subSet(34, false, 54, true)); //exclusive 34, inclusive 54
		System.out.println("Number before 50: " + numbers.headSet(50)); 
		System.out.println("Number after 50: " + numbers.tailSet(50)); 
	}
}
