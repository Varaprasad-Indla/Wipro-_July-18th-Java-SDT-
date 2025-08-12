package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<Integer, String>map = new HashMap<Integer, String>();
		
		map.put(1,"Amit");
		map.put(2,"Vijay");
		map.put(3,"Rahul");
		map.put(null,null);
		map.put(3,"Kumar");
		

		Set set = map.entrySet();
		
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		
		
	}

}
