package corejava12025;

public class SingleinChildClass extends SingleSuperClass {
	
	
	String model = "Mustang";
	
	public void display() {
		
	
	System.out.println("Brand is " + brand);
	System.out.println("Model is " + model);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleinChildClass obj = new SingleinChildClass();
		
		obj.start(); 
		obj.display();
		
		
		
	
		
		
		
		

	}

}
