package Package1;

public class SamePackNonSubClass {
	public void write() {
		System.out.println("writing in sub class");
		
	}

	public static void main(String[] args) {
		Class1 obj = new Class1 ();
		
		SamePackNonSubClass obj1 = new SamePackNonSubClass ();
		
		obj1.write();

		obj.display();
		obj.fetchemployeeID();
		obj.fetchname();
	}

}
