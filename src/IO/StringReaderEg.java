package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderEg {

	public static void main(String[] args) throws IOException {
		StringWriter sw = new StringWriter();
        BufferedWriter bw = new BufferedWriter(sw);


        bw.write("Hello, this is written using StringWriter");
        bw.write("This is String Writer");
        bw.close(); 

    
        String writtenContent = sw.toString();


        StringReader sr = new StringReader(writtenContent);
        BufferedReader br = new BufferedReader(sr);

      
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}