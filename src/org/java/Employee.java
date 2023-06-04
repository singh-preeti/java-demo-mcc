package org.java;

public class Employee {
	public void addEmployee()
	{
		System.out.println("Employee added");
	}
	public void updateEmployee()
	{
		System.out.println("Updated the employee details!");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.addEmployee();
		emp.updateEmployee();
	}

}
