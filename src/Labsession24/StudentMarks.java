package Labsession24;

public abstract class StudentMarks {

	
		String name;
	    int rollNo;

	    public void Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    
	    abstract String getGrade(double marks);

	   
	    public void display(double marks) {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + getGrade(marks));
	        System.out.println();
	    }
	}


	class EngineeringStudent extends StudentMarks {

	    public EngineeringStudent(String name, int rollNo) {
	        super();
	    }

	
	    String getGrade(double marks) {
	        if (marks >= 85) return "A";
	        else if (marks >= 70) return "B";
	        else if (marks >= 50) return "C";
	        else return "F";
	    }
	}


	 class MedicalStudent extends StudentMarks {

	    public MedicalStudent(String name, int rollNo) {
	        super();
	    }

	    
	     String getGrade(double marks) {
	        if (marks >= 80) return "Distinction";
	        else if (marks >= 65) return "First Class";
	        else if (marks >= 50) return "Second Class";
	        else return "Fail";
	    }
	}

	
	 class CollegeAdmissionSystem {
	    public static void main(String[] args) {
	        EngineeringStudent engStu = new EngineeringStudent("Alice", 101);
	        MedicalStudent medStu = new MedicalStudent("Bob", 202);

	        engStu.display(78);
	        medStu.display(72);
	    }
	}