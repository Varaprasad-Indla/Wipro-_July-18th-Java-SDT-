package LabSessionday4;

public abstract class Student {
	    protected String name;
	    protected int rollNo;

	    public Student(String studentName, int studentRollNo) {
	        name = studentName;
	        rollNo = studentRollNo;
	    }

	    public abstract String getGrade();
	}
