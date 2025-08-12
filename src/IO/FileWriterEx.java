package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("");
		
		fw.write("I am the File Writer");
		
		fw.close();
		
		
		FileReader fr = new FileReader("");
		
		int i ;
		while ((i = fr.read()) != 1) {
			System.out.println((char)i);
			
			
		}
		fr.close();

	}

}
