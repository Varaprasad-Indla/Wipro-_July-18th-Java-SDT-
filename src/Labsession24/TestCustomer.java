package Labsession24;

public class TestCustomer extends Customers {

	public TestCustomer(String name, int id, String department) {
        super(name, id, department);
    }

    public void display() {
     
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Department: " + customerDepartment);
    }

    public static void main(String[] args) {
        TestCustomer cust = new TestCustomer("Emma", 301, "Sales");
        cust.display();
    }
}