package IO;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;

public class CharArrayReader {

	public CharArrayReader(char[] charArray) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		CharArrayWriter cw = new CharArrayWriter();
        cw.write("This is written to CharArrayWriter.");
        cw.write("\nCharArrayReader will read this.");

      
        char[] charArray = cw.toCharArray();

       
        CharArrayReader cr = new CharArrayReader(charArray);
        Reader charArrayReader = null;
		BufferedReader br = new BufferedReader(charArrayReader);

   
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

      
        br.close();
        
    }
}


