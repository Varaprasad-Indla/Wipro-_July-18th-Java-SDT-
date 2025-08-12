package LabSession31;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6}; 
        int n = arr.length + 1;      

       
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}