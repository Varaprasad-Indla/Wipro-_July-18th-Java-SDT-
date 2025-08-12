package Labsession24;

public class TestEmployee extends Employee {
	 public TestEmployee(String name, int id, String department) {
	        super(name, id, department);
	    }

	    public void displayEmployeeInfo() {
	     
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Employee Department: " + employeeDepartment);
	    }

	    public static void main(String[] args) {
	        TestEmployee emp = new TestEmployee("John", 201, "Marketing");
	        emp.displayEmployeeInfo();
	    }
	}