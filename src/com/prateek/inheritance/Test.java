package com.prateek.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] { "Flight Reservation", "Check In" };
		Manager manager = new Manager(1, "John", "Travel", 100000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.department);
		System.out.println(manager.salary);
		manager.work();
		System.out.println();

		String[] technology = new String[] { "fse" };
		Developer developer = new Developer(2, "Prateek", "Travel", 100000, technology);
		developer.work();
	}

}
