package LabSession01;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadStudents {

	public static void main(String[] args) {
        String s1 = (""); 

        try {
            List<String> students = Files.readAllLines(Paths.get(s1));

            System.out.println("List of Students:");
            for (String student : students) {
                System.out.println(student);
            }

        } catch (Exception e) {
            System.out.println("Error reading student file " + e.getMessage());
        }
    }
	}


