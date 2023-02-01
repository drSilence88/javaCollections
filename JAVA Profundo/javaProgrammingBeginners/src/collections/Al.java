package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Al {
	public static void main(String[] args) {
		List<String> words = List.of("Apple", "Cat", "Bat");
		List<String> wordsAl = new ArrayList<>(words);
		
		for(String word : wordsAl) {
			if(word.endsWith("at")){
				System.out.println(word);
			}
		}
		System.out.println("-------------------------");
		
		for(String word : wordsAl) {
			if(word.endsWith("at")){
				wordsAl.remove(word);
			}
		}
		System.out.println(wordsAl);
		
		Iterator<String> iterator = wordsAl.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println(wordsAl);
	}
}
