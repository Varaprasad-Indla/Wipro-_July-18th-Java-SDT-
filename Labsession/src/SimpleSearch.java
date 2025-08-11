
public class SimpleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5, 8, 18, 20, 30};
		 
		int target = 20;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at index" + i);
				return;
				
			}
		}
		System.out.println("Element not found in the array");
 	}

}
