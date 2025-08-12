package Company;

public class Employee {
    public static String employeeName = "Varaprasad";
    public static String employeeId = "58445";
    public static String employeeDepartment = "Java-Selenium";

    public Employee(String name, String id, String dept) {
        this.employeeName = name;
        this.employeeId = id;
        this.employeeDepartment = dept;
    }

	public static void main(String[] args) {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Department: " + employeeDepartment);
    }
}

