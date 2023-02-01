package collections;

import java.util.Iterator;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		List<String> lists = List.of("edd", "num", "path", "compu", "rae", "evolution", "xar", "pet", "run", "VOLCAN");
		
		for(int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i).length());
		} 
		System.out.println("----------------------------");
		
		for(String list: lists) {
			System.out.println(list.length());
		}
		System.out.println("----------------------------");
		Iterator listsIterator = lists.iterator();
		while(listsIterator.hasNext()) {
			System.out.println(listsIterator.next());
		}
		System.out.println("----------------------------");
		
		List<Integer> listsInteger = List.of(1,2,3,4,5,6,7);
		
		for(int j = 0; j < listsInteger.size(); j++) {
			System.out.println(listsInteger.get(j));
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		for(Integer intList : listsInteger) {
			System.out.println(intList);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Iterator iteratorInt = listsInteger.iterator();
		while(iteratorInt.hasNext()) {
			System.out.println(iteratorInt.next());
		}
	}
}
