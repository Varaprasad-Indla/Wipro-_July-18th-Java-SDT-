package Customers;

public class Customer {
	protected static String customerName = "varaprasad";
    protected static String customerId = "199";
    protected static String customerDepartment = "Purchase";

    public Customer(String name, String id, String dept) {
        this.customerName = name;
        this.customerId = id;
        this.customerDepartment = dept;
    }

	public static void main(String[] args) {
		System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Department: " + customerDepartment);
    }
}