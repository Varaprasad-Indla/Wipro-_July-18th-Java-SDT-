package corejava12025;

public class StringsEgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "Core Java";
		String S2 = "Selenium";
		
		System.out.println(S1.equals(S2));
		System.out.println(S1.concat(S2));
		System.out.println(S1.substring(5));
		System.out.println(S1.substring(2, 3));
		System.out.println(S1.isEmpty());
		System.out.println(S1.endsWith("a"));
		
		String str3 = String.join("-", "Testing","Core Java");
		System.out.println(str3);
		
		System.out.println(S1.compareTo(S2));
		
		String text = "Selenium is a Testing Tool";
		
		String[] result = text.split(" ");
		
		for (String str : result) {
			
			System.out.println(str + ",");
		}
		

		
	}

}
