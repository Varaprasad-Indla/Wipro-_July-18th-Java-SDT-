package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderEx {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(""));
		
		bw.write("I am the Buufered file Writer");
		
		bw.close();
		
		BufferedReader br = new BufferedReader (new FileReader(""));
		
		String line;
		
		while ((line = br.readLine())!= null ) {
		System.out.println(line);
	}
		br.close();
}
}