package LabSession02;

public class PrimeNumbers {

	public static void main(String[] args) throws InterruptedException {
		 	 int[] sum1 = {0};
	         int[] sum2 = {0};

	        Thread t1 = new Thread(() -> {
	            int Sum = 0;
	            for (int i = 1; i <= 10; i++) {
	                if (isPrime(i)) Sum += i;
	            }
	            sum1[0] = Sum;
	        });

	        Thread t2 = new Thread(() -> {
	            int Sum = 0;
	            for (int i = 51; i <= 10; i++) {
	                if (isPrime(i)) Sum += i;
	            }
	            sum2[0] = Sum;
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        int totalSum = sum1[0] + sum2[0];
	        System.out.println("Total sum of prime numbers " + totalSum);
	    }

	    static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	}
