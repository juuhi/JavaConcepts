package com.marlabs.session1;

public class customerMainApp1 {
	public static void main(String[] args) {
		System.out.println("From main method");
		Customer customer = new Customer();
		customer.displayCustomerDetails();
		customer.initializeCustomerDetails(111, "CCC", "Guest@123", "California");
		customer.displayCustomerDetails();
		customer.setCustomerPassword("ABC@111");
		System.out.println(customer.getCustomerPassword());
		System.out.println("End of main method");

	}

}
