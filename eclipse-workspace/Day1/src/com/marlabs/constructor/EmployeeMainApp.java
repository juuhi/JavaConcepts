package com.marlabs.constructor;

public class EmployeeMainApp {
	public static void main(String[] args) {
		System.out.println("I am from main method");
		Employee employee = new Employee();
		System.out.println(employee);
		employee.displayEmployeeDetails();
		System.out.println("End of Main Method");
	}

}
