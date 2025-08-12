package LabSessionday4;



public class MainClass {
    public static void main(String[] args) {
        EngineeringStudent engStudent = new EngineeringStudent("Vara", 234, 90);
        MedicalStudent medStudent = new MedicalStudent("Prasad", 218, 95);

        System.out.println("Engineering Student:");
        System.out.println("Name: " + engStudent.name);
        System.out.println("Roll No: " + engStudent.rollNo);
        System.out.println("Grade: " + engStudent.getGrade());

        System.out.println("Medical Student:");
        System.out.println("Name: " + medStudent.name);
        System.out.println("Roll No: " + medStudent.rollNo);
        System.out.println("Grade: " + medStudent.getGrade());
    }
}
