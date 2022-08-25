package com.prateek.inheritance;

public class Manager extends Employee {
	String[] projects;

	public Manager(int id, String name, String department, double salary, String[] projects) {
		super(id, name, department, salary);
		System.out.println("Inside Manager Constructor");
		this.projects = projects;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing " + projects);
		for (int i = 0; i < projects.length; i++) {
			System.out.println(projects[i]);
		}
	}
}
