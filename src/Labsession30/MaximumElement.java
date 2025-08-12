package Labsession30;

import java.util.ArrayList;

public class MaximumElement {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();

       
        n.add(18);
        n.add(07);
        n.add(10);
        n.add(45);
        n.add(34);

        if (n.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        } 
            int max = n.get(0);
        
        for (int num : n) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}

