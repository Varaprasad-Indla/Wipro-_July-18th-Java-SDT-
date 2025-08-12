package corejava12025;

public class InterfaceChild implements Interface1{

	public void display1() {
		System.out.println("Displaying in child class");
	}
	
	
	public static void main(String[] args) {
		InterfaceChild obj = new InterfaceChild();
		obj.display1();
		Interface1.write();
		obj.show();

		System.out.println(employeename);
		System.out.println(employeeId);
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
