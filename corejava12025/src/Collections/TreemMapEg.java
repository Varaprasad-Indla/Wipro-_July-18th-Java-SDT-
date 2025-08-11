package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreemMapEg {

	public static void main(String[] args) {
		/*
		 * 1.An object that maps keys to values
		 * 2.A map cannot maintain duplicate values
		 * 3.Each key can map to at most one value
		 * 4.The map is sorted according to the natural ordering of its key
		 * 5.no null as key is allowed
		 * 6.Values can be duplicated
		 * 7.Multiple null values are allowed 
		 * 8.This implementation is not synchronize
		 */
Map<Integer, String>map = new TreeMap<Integer, String>();
		
		
		map.put(2,"Vijay");
		map.put(3,"Rahul");
		map.put(4,"Kumar");
		map.put(5, null);
		map.put(6, null);
		map.put(7,"Rahul");
		map.put(1,"Amit");
		Set set = map.entrySet();
		
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		
		
	}

}
