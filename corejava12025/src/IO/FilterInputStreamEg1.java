package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEg1 {

	public static void main(String[] args) {
			
		FileInputStream fis = null;
		FilterInputStream filterinput = null;
		try {
			fis = new FileInputStream("");
			//wrap the file input stream with buffered input stream
			filterinput = new BufferedInputStream(fis);
			//read and print the file content
			int data ;
			
			while ((data = filterinput.read()) != -1) {
				
				System.out.println((char) data);
				
				
			}
			fis.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
