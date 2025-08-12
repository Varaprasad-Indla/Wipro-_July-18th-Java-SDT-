package Package1;

import Package1.Class1;

public class DiffPackSubclass extends Class1{
public void create() {
	System.out.println("Creating in sub class");
}
	public static void main(String[] args) {
		DiffPackSubclass obj = new DiffPackSubclass ();
		
		obj.create();
		obj.display();
		obj.fetchname();

	}

}
