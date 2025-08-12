package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSubClass1 implements Comparator<EmployeeSalary>{
	
	public int compare(EmployeeSalary e1, EmployeeSalary e2) {
		return Double.compare(e2.Salary, e1.Salary);
    		
		
    }


	public static void main(String[] args) {
		List<EmployeeSalary> Employee = new ArrayList<>();
        Employee.add(new EmployeeSalary("Ravi", 25000));
        Employee.add(new EmployeeSalary("Amit", 23000));
        Employee.add(new EmployeeSalary("Zara", 24000));
        Employee.add(new EmployeeSalary("Ram", 30000));

        Collections.sort(Employee, new ComparatorSubClass1());

        for (EmployeeSalary e : Employee) {
            System.out.println(e);
        }
    }
}

