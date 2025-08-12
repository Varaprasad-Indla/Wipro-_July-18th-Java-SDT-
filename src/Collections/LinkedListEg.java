package Collections;

import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Ravi");
		ll.add("Vara");		
		ll.add("Prasad");
		ll.add("Mahesh");
		ll.add("Sai");
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.indexOf("Vara"));
		System.out.println(ll.get(3));
		System.out.println(ll.indexOf("Sai"));
		System.out.println(ll.remove(3));
		System.out.println(ll);
		System.out.println(ll.set(3,"Praveen"));
		System.out.println(ll);
		System.out.println(ll.size());
		
	}

}
