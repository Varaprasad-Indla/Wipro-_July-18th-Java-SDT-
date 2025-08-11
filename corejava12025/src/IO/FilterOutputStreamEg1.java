package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEg1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		FilterOutputStream filterOut = null;
		try {
			fos = new FileOutputStream("");
			
			
			filterOut = new BufferedOutputStream(fos);
			//read and print the file content
			String text = "Hi how are you";
			
			filterOut.write(text.getBytes());
			}
		catch (Exception e) {
			System.out.println(e);
			fos.close();
		}finally {
			filterOut.close();
			fos.close();
		}
		
	}

}
