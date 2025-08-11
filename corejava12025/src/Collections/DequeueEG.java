package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueEG {

	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		
		d.addFirst("Java");
		d.addFirst("Pythom");
		d.addFirst("C");
		d.addFirst("C++");
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		d.removeFirst();
		d.removeLast();
		
		System.out.println(d);
		
		
	}

}
