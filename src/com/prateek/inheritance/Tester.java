package com.prateek.inheritance;

public class Tester extends Employee {
	String[] tools;

	public Tester(int id, String name, String department, double salary, String[] tools) {
		super(id, name, department, salary);
		this.tools = tools;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Tester is testing" + tools);
		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i]);
		}
	}
}
