package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsMethod {
	int id;
	String name;

	 EqualsMethod(int id , String name) {
		this.id = id;
		this.name = name;
	}
	 // Overriding equal () to compare the object content
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj) return true ; // same reference
		 if(obj == null || getClass()!= obj.getClass()) return false;
		 Employee other  = (Employee)obj;
		 return this.id == other.id && this.name.equals(other.name);
	 }
	 @Override
	 public int hashCode() {
		 return Objects.hash(id ,name);
	 }
	 @Override
	 public String toString() {
			return id   + "_" + name;
		}
	public static void main(String[] args) {
		List<Employee>  employees = new ArrayList<>();
		employees.add(new Employee (103, "Ravi"));
		employees.add(new Employee (101, "Amit"));
		employees.add(new Employee (102, "Zara"));
		employees.add(new Employee (104, "John"));
		employees.add(new Employee (105, "Ram"));
		for (Employee e: employees ) {

			System.out.println(e);

		}
 
 
	}
}
 