package LabSessionday4;
public class MedicalStudent extends Student {
    private int marks;

    public MedicalStudent(String studentName, int studentRollNo, int studentMarks) {
        super(studentName, studentRollNo);  
        marks = studentMarks;
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 65) return "C";
        else return "F";
    }
}
