package LabSession31;

public class SecondLargestArray {

	public static void main(String[] args) {
		int[] numbers = {18, 45, 34, 10, 120, 100, 89};
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for (int num: numbers) {
			if(num > largest) {
				secondlargest = largest;
				largest = num;
			}else if (num>secondlargest && num != largest) {
				secondlargest= num;
			}
		}
		if(secondlargest == Integer.MIN_VALUE) {
			System.out.println("Second Largest number found");	
		}else {
			System.out.println("Second Largest number :"+ secondlargest);
		}
	}

}
