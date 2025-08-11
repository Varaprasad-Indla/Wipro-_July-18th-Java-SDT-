package IO;

import java.util.Scanner;

public class ReadingFromKeyboard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the fisrt number");
		int a = s.nextInt();
		
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Sum is : "+ (a+b));
		s.close();
		
	}

}
