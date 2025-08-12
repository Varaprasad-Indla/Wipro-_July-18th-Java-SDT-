package corejava12025;

public interface Interface1 {

	abstract void display();
	static void write() {
		System.out.println("writing in interface");
	}
	default void show () {
		System.out.println("showing");
	}
	public static String employeename = "Varaprasad";
	int employeeId = 99545;
}
