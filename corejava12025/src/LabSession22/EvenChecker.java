package LabSession22;

public class EvenChecker {

	 public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }

	    public static void main(String[] args) {
	        int[] testNumbers = {4, 7, 0, -2, 13};

	        for (int num : testNumbers) {
	            if (isEven(num)) {
	                System.out.println(num + " is even.");
	            } else {
	                System.out.println(num + " is odd.");
	            }
	        }
	    }
	}