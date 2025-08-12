package corejava12025;

public class StringBuilderEg {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb);
		
		
		sb.append("World");
		
		System.out.println(sb);
		
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.insert(5, false));

		
		System.out.println(sb.delete(1, 2));
		
		
		System.out.println(sb.indexOf("Hello"));
		
		
	}
	
	

}
