package corejava12025;

public class StringEgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Hello world";
		
		System.out.println(S1);
		
		
		char[] ch  = {'h', 'e', 'l', 'l', 'o'};
		
	
		
		
		
		String S3 = new String("Hello");
		
		System.out.println(S3);
		
		
		String str1 = "Muumbai";
		
		String str2 = "Delhi";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.contains("z"));
				
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,3));
		
		System.out.println(str1.replace("i", "g"));
		
		System.out.println(str1.replaceAll(str1, str2));
		
		
		
		
		
		}

}
