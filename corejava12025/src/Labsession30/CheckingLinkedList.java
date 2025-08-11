package Labsession30;

import java.util.LinkedList;

public class CheckingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>();


        l1.add("Pine Apple");
        l1.add("Banana");
        l1.add("Grapes");

       
        l2.add("Apple");
        l2.add("Banana");
        l2.add("Cherry");

        
        if (l1.equals(l2)) {
            System.out.println("The linked lists are equal.");
        } else 
        
        {
        	
            System.out.println("The linked lists are not equal.");
        }
    }
}

