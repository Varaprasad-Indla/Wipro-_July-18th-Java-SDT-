package LabSession01;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
	
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = s.nextLine();

	        System.out.println("Hello," + name + "");

	        s.close();
	    }
	}