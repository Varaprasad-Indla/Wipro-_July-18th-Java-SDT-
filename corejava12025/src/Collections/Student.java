package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
	int rollNumber;
	String name;
	
	//Constructor added
	public Student (int rollNumber, String name) {
		This.rollNumber = rollNumber;
		This.name = name;
	}
	 public int compareTo(Student s) {
		return this.rollNumber - s.rollNumber;
	}
	
	Public String toString() {
		return rollNumber+"-"+name;
	}

	public static void main(String[] args) {
		List<Student> Students = new ArrayList<>();
		Students.add(new Student (103, "Ravi"));
		Students.add(new Student (101, "Amit"));
		Students.add(new Student (102, "Sara"));
		
		Collections.sort(Students){
			for (Student = : Students) {
				System.out.println(s);
			}
		}
		
	}

	

}
