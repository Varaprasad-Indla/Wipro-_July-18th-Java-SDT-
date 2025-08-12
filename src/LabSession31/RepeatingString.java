package LabSession31;

public class RepeatingString {

	public static void main(String[] args) {
		String input = "Varaprasad";
		
		for (int i =0; i<input.length(); i++) {
			char ch = input.charAt(i);
			boolean isUnique = true;
			 for (int j = 0; j < input.length(); j++) {
	                if (i != j && ch == input.charAt(j)) {
	                    isUnique = false;
	                    break;
			}
			 }
	                if (isUnique) {
	                    System.out.println("1st Non-repeating character:" + ch);
	                    return;
	            }
			 }
		System.out.println("No non-repeating character");
		}
	}




