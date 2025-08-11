package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetsEg {

	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		
		s.add("Orange");
		s.add("Grapes");
		s.add("Banana");
		s.add("Pine Apple");
		s.add("Apple");
		s.add("Null");
		s.add("Null");
		
		System.out.println(s);
		System.out.println(s.remove("Pine Apple"));
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		
	}

}
