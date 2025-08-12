package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSubCalss implements Comparator<Employee> {

		 public int compare(Employee e1, Employee e2) {
			return e1.name.compareTo(e2.name);
		 }
	public static void main(String[] args) {
		
		
		
		List<Employee> Employees = new ArrayList<>();
		Employees.add(new Employee (103,"Ravi"));
		Employees.add(new Employee (102,"Amit"));
		Employees.add(new Employee (101,"Zara"));
		Employees.add(new Employee (104,"Zara"));
		Collections.sort(Employees, new ComparatorSubCalss());
		for(Employee e: Employees) {
			System.out.println(e);
		}
	

	
	}

}
