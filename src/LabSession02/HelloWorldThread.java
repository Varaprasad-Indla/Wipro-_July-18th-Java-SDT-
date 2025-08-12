package LabSession02;

public class HelloWorldThread extends Thread{

		public void run() {
	        System.out.println("Hello, World");
	    }

	    public static void main(String[] args) {
	        HelloWorldThread thread = new HelloWorldThread();
	          
	        thread.start();
	       
	    }
	}

