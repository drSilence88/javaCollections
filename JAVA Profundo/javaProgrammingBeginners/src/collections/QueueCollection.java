package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}

}

public class QueueCollection {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new LengthComparator());
		queue.poll();
		queue.offer("Apple");
		System.out.println(queue.poll());
		queue.addAll(List.of("Zebra","Monkey","Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	} 
}
