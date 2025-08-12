package Labsession25;

public class EmployeeSalary {
	private String name;
	private int id;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = name;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	
	}
	public int getsalary() {
		return salary;
	}
	public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
	}
	public static void main(String[] args) {
		EmployeeSalary obj = new EmployeeSalary(); 
		
		obj.setName("Varaprasad");
		obj.setId(55456);
		obj.setSalary(25882);		
	}

}
