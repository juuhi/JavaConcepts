package com.marlabs.session1;

public class customerMainApp {
	public static void main(String[] args) {
		System.out.println("I am main method");
		Customer customer = new Customer();
		customer.displayCustomerDetails();
		customer.customerId = 111;
		customer.customerName = "AAA";
		customer.customerCity = "Banglore";
		customer.displayCustomerDetails();

		Customer customer1 = new Customer();
		// customer1.displayCustomerDetails();
		customer1.customerId = 222;
		customer1.customerName = "BBB";
		customer1.customerCity = "Delhi";
		customer1.setCustomerPassword("Admin@123");
		customer1.displayCustomerDetails();
		// System.out.println(customer1.getCustomerPassword());

		System.out.println("End of the method");
	}
}
