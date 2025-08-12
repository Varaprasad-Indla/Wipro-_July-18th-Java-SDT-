package LabSession02;

import java.util.Arrays;

public class SimpleSort {

	public static void main(String[] args) throws InterruptedException {
        int[] arr = {9, 4, 7, 2, 1, 6, 3, 5};

      
        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arr2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

       
        Thread t1 = new Thread(() -> {
            Arrays.sort(arr1);
            System.out.println("Sorted Part 1: " + Arrays.toString(arr1));
        });

   
        Thread t2 = new Thread(() -> {
            Arrays.sort(arr2);
            System.out.println("Sorted Part 2: " + Arrays.toString(arr2));
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}