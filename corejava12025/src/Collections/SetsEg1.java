package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetsEg1 {

	public static void main(String[] args) {
		Set<Integer> i = new TreeSet<Integer>();
		
		i.add(7);
        i.add(45);
        i.add(18);
        i.add(34);
        
        
        System.out.println(i);
        System.out.println(i.remove(7));
        System.out.println(i);
        System.out.println(i.isEmpty());
        System.out.println(i.size());
        System.out.println(i.isEmpty());
        
	}

}
