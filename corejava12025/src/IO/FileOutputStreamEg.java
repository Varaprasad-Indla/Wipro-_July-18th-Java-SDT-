package IO;

import java.io.FileOutputStream;

public class FileOutputStreamEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "I am attending the Java Class";
		try {
			FileOutputStream output = new FileOutputStream("");	
			
			
			byte [] array = data.getBytes();
			
			output.write(array);
			output.close();
			
		
	} 
		catch (Exception e){
		
		System.out.println(e);
	}
		
		
	}

}
