package Labsession30;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateElements {

	public static void main(String[] args) {
		
				Set<String> s = new TreeSet<String>();

		
				String[] names = {
					"Vara", "Prasad", "Sai", "Praveen", "Ram", "Ravi", "Ram"};
				for (String name : names) {
					boolean added = s.add(name);
					if (!added) {
						System.out.println("Duplicate found: " + name);
					}
				}

				
				System.out.println(s);
								
			}
		}

