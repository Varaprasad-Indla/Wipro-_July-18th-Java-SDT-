package Collections;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vara");		
		al.add("Prasad");
		al.add("Mahesh");
		al.add("Sai");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.indexOf("Vara"));
		System.out.println(al.get(3));
		System.out.println(al.indexOf("Sai"));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.set(3,"Praveen"));
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
