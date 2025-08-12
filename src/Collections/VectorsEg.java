package Collections;

import java.util.Vector;

public class VectorsEg {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.add("Java");
		v.add("Python");
		v.add("C");
		v.add("C++");
	
		
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(null));
	}

}
