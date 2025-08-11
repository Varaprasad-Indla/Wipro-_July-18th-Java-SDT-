package corejava12025;

public class EncapsulationEg {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getAge() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public static void main(String[] args) {
		EncapsulationEg obj = new EncapsulationEg();
		
		obj.setName("Varaprasad");
		obj.setAge(22);
	}

}
