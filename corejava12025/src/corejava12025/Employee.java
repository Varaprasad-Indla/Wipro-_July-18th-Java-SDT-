package corejava12025;

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

   
    abstract double calculateSalary();
}


class PermanentEmployee extends Employee {
    private double monthlySalary;

    public PermanentEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

   
    double calculateSalary() {
        return monthlySalary;
    }
}


class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


abstract class Main {
    public static void main(String[] args) {
        Employee emp1 = new PermanentEmployee("Alice", 101, 50000);
        Employee emp2 = new ContractEmployee("Bob", 102, 100, 120);

        System.out.println("Permanent Employee Salary: " + emp1.calculateSalary());
        System.out.println("Contract Employee Salary: " + emp2.calculateSalary());
    }
}
