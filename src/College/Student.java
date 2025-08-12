package College;

public class Student {
	private static String studentName = "Varaprasad";
    private static String studentId = "234";
    private static String studentDepartment = "EEE";
    public Student(String name, String id, String dept) {
        this.studentName = name;
        this.studentId = id;
        this.studentDepartment = dept;
    }
    

	public static void main(String[] args) {
				
		System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Department: " + studentDepartment);
    }
}


