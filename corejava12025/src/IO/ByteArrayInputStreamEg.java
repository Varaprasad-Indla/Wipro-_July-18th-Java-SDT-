package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEg {

	public static void main(String[] args) {
		byte[] array = {1,2,3,4};
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			
			for (int i = 0 ; i <array.length; i++) {
				
				int data = input.read();
				System.err.println(data);
			}
			input.close();
		} catch (Exception e) {	
		
	System.out.println(e);	

	}
	}
}
