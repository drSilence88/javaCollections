package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','A','B','Z','F','S','X','V','G','E','T');
		
		Set<Character> characterSet = new HashSet<>(characters);
		System.out.println(characterSet);	
		
		Set<Character> characterLinked = new LinkedHashSet<>(characters);
		System.out.println(characterLinked);	
		
		Set<Character> characterTree = new TreeSet<>(characters);
		System.out.println(characterTree);	
		
	}
}
