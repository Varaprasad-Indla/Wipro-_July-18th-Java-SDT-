package Labsession30;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> I = new ArrayList<Integer>();

		I.add(35);
		I.add(18);
		I.add(34);
		I.add(7);
		I.add(10);

		System.out.println(I);

	
		Collections.sort(I);

		System.out.println(I);
	}
}