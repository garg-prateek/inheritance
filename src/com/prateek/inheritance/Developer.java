package com.prateek.inheritance;

public class Developer extends Employee {
	String[] technology;

	public Developer(int id, String name, String department, double salary, String[] technology) {
		super(id, name, department, salary);
		System.out.println("Inside developer constructor");
		this.technology = technology;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is developing " + technology);
	}
}
