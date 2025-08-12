package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Collections.Student;

public class SerializationEg {

	public static void main(String[] args) {
		try {
			Student s1 = new Student(211,"John");
			
		FileOutputStream fout = new FileOutputStream("");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		
		fout.close();
		out.close();
		System.out.println("Object is Serialized");
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
