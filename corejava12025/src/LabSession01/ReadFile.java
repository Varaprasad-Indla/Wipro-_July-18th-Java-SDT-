package LabSession01;

import java.io.File;
import java.nio.file.Files;

public class ReadFile {

	public static void main(String[] args) {
        String filePath = ("");

        try {
            File f = new File(filePath);
            byte[] fileBytes = Files.readAllBytes(f.toPath());

            System.out.println("File read successfully.");
            System.out.println("Total bytes: " + fileBytes.length);

         

        } catch (Exception e) {
            System.out.println("An error occurred while reading the file");
            e.printStackTrace();
        }
    }
}