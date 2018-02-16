package com.marlabs.constructor;

public class Employee {
	int empNumber;
	String empName;
	String empType;
	int empDeptNumber;
	double empBasic;
	private String empPassword;

	/**
	 * @return the empPassword
	 */
	public String getEmpPassword() {
		return empPassword;
	}

	/**
	 * @param empPassword
	 *            the empPassword to set
	 */
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Employee() {
		System.out.println("I am default constructor");
		empNumber = 111;
		empName = "AAA";
		empType = "Contract";
		empDeptNumber = 10;
		empBasic = 9000;
		empPassword = "Test@123";
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee Number" + "\t" + empNumber);
		System.out.println("Employee Name" + "\t" + empName);
		System.out.println("Employee Type" + "\t" + empType);
		System.out.println("Employee Department Number" + "\t" + empDeptNumber);
		System.out.println("Employee Basic" + "\t" + empBasic);
	}

}
