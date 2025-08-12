package corejava12025;

public class ParamterizedMethods {
	
	public void add() {
		int a = 8;
		
		int b = 9;
		
		int c = a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
	
		ParamterizedMethods pm = new ParamterizedMethods();
		
	    pm.add1(7, 8);
		pm.add2(8, 4);
		pm.add3(-5, -8);
		
	}

}
