package IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEg {

	public static void main(String[] args) {
		String data = "This is a line of text";
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();	
			
			byte [] array = data.getBytes();

			out.write(array);
			
			String streamData = out.toString();
			System.out.println("Output stream:" + streamData);
	} 
		catch (Exception e){
		
		System.out.println(e);
	}
		
		
	}


	}


