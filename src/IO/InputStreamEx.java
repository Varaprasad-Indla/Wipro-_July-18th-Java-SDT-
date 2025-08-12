package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
		FileInputStream input = new FileInputStream("C://Program Files//WSL//wslsettings//System.IO.FileSystem.Watcher.dll/");
		System.out.println("Data in the File");
		
		int i = input.read();
		while (i != -1 ) {
			System.out.print((char) i);
			
			i = input.read();
		}
		
		input.close();
		}
		catch (Exception e){
			 System.out.println(e);
		}

	
		}
	}



