package Labsession30;

import java.util.ArrayList;

public class SecondLargestElement {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		i.add(18);
        i.add(25);
        i.add(7);
        i.add(10);
        i.add(45);
        i.add(55);
        
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : i) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println(secondLargest);
        }
    }
}


