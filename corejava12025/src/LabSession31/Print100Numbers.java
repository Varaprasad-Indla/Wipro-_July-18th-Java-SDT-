package LabSession31;

public class Print100Numbers {
	
	public static void PrintNumbers(int i) {
		if(i>100) {
			return;
		}
		System.out.println(i);
		PrintNumbers(i +1);
	}
	
	public static void main(String[] args) {
		PrintNumbers(1);

	}

}
