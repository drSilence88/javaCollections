package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String[] args) {
		Set<String> setString = Set.of("Apple", "Dog", "Cat");
		System.out.println(setString);
		
//		setString.add("Apple");
//		setString.add("Linna");
		
		Set<String> hasString = new HashSet<>(setString);
		System.out.println(hasString);
		
		Set<Integer> numbersH = new HashSet<>();
		numbersH.add(7654);
		numbersH.add(6453);
		numbersH.add(765);
		numbersH.add(76);
		System.out.println(numbersH);
		
		Set<Integer> numbersL = new LinkedHashSet<>();
		numbersL.add(7654);
		numbersL.add(6453);
		numbersL.add(765);
		numbersL.add(76);
		numbersL.add(2313);
		System.out.println(numbersL);
		
		Set<Integer> numbersT = new TreeSet<>();
		numbersT.add(7654);
		numbersT.add(6453);
		numbersT.add(765);
		numbersT.add(76);
		numbersT.add(2313);
		System.out.println(numbersT);
		
	}
}
