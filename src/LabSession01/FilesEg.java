package LabSession01;

import java.io.File;

public class FilesEg {

	public static void main(String[] args) {
		String s = ("");
		
		File f = new File(s);
		
		 if (f.isDirectory()) {
	            File[] files = f.listFiles();

	            if (files != null) {
	                for (File file : files) {
	                    System.out.println(file.getName());
	                }
	            } 
	    else {
	          System.out.println("The directory is empty or can't be read");
	            }
	        } 
		 else {
	            System.out.println("Invalid path");
	        }
	    }


}

