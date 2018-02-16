package com.marlabs.session1;

public class Customer {
	int customerId;
	String customerName;
	private String customerPassword;
	String customerCity;

	/**
	 * @return the customerPassword
	 */
	public String getCustomerPassword() {
		return customerPassword;
	}

	/**
	 * @param customerPassword
	 *            the customerPassword to set
	 */
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public void initializeCustomerDetails(int customerId, String customerName, String customerPassword,
			String customerCity) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerCity = customerCity;
	}

	public void displayCustomerDetails() {
		System.out.println("CustomerId:" + "\t" + customerId);
		System.out.println("CustomerName:" + "\t" + customerName);
		System.out.println("CustomerCity" + "\t" + customerCity);
	}
}