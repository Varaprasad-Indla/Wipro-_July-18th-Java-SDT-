package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEg {

	public static void main(String[] args) {
HashSet<String> hs = new HashSet<String>();
		
		hs.add("Vara");
		hs.add("Prasad");
		hs.add("Sai");
		hs.add("Praveen");
		hs.add("Ram");
		hs.add("Ravi");
		hs.add(null);
		hs.add("Ram");
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("Null"));
		System.out.println(hs.size());
		

	}

}
