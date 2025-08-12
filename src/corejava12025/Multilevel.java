package corejava12025;

public class Multilevel {
	class A {
	    void displayA() {
	        System.out.println("Class A");
	    }
	}

	class B extends A {
	    void displayB() {
	        System.out.println("Class B");
	    }
	}

	class C extends B {
	    void displayC() {
	        System.out.println("Class C");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        C obj = new C();
	        obj.displayA();  
	        obj.displayB(); 
	        obj.displayC();  
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
