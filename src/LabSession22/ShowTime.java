package LabSession22;

import java.util.Date;

public class ShowTime {

	 public static void main(String[] args) {
	       
	        double num1 = 1235;
	        double num2 = 2534;

	        int n1 = (int)(num1 * 100);
	        int n2 = (int)(num2 * 100);

	        if (n1 == n2) {
	            System.out.println("The numbers are the same up to two decimal places.");
	        } else {
	            System.out.println("The numbers are NOT the same up to two decimal places.");
	        }

	   
	        Date now = new Date();
	        System.out.println("Current Date time: " + now);
	    }
	}