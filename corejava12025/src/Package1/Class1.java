package Package1;

public class Class1 {
	protected static String employeeName = "Vara Prasad";
	protected void fetchname() {
		System.out.println("The employeeN name is" + employeeName);
	}
	private static String employeeSalary = "5666787";
	private void fetchsalary() {
		System.out.println("The employee salary is" + employeeSalary);
	}

	public void display () {
	System.out.println("displaying the data");
}
	
	int employeeID = 58999 ;
	void fetchemployeeID (){
		System.out.println("The employee id is" + employeeID);
	}
	

	public static void main(String[] args) {
	
		Class1 obj = new Class1();
obj.display();
obj.fetchsalary();
obj.fetchemployeeID();
obj.fetchname();
	}

}
