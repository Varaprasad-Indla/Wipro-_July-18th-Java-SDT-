package corejava12025;

public class stringBufferEg {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb);
		
		
		sb.append("World");
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.insert(1, 0));
		
		
		System.out.println(sb.delete(1, 2));
		
		System.out.println(sb.substring(5));
		
		System.out.println(sb.replace(6, 1, null));
		
		System.out.println(sb.charAt(4));
		
		String str = "Hi";
		
		System.out.println(sb.indexOf(str));
		
		System.out.println(sb.length());
		

	}

}
