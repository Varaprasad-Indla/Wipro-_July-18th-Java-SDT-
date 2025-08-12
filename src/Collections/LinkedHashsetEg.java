package Collections;

import java.util.LinkedHashSet;

public class LinkedHashsetEg {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("Vara");
		lh.add("Prasad");
		lh.add("Sai");
		lh.add("Praveen");
		lh.add("Ram");
		lh.add("Ravi");
		lh.add(null);
		lh.add("Ram");
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.remove(null));
		System.out.println(lh);
		System.out.println(lh.size());
		
		
		
	}

}
