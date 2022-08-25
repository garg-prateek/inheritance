package com.prateek.inheritance;

public class Employee {
	int id;
	String name;
	String department;
	double salary;

	public Employee(int id, String name, String department, double salary) {
		System.out.println("Inside employee");
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	protected void work() {
		
		System.out.println("Common Work for Everyone");
	}
}
