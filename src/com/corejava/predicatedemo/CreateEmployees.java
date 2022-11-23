package com.corejava.predicatedemo;

public class CreateEmployees {

	public Employee[] importEmployees() {
		Employee[] employeeList = { new Employee(1, "John Wick", "CEO", "Banglore", 10000),
				new Employee(2, "John Wick", "Associate", "Pune", 500),
				new Employee(3, "John Wick", "Manager", "Banglore", 3000),
				new Employee(4, "John Wick", "Senior Associate", "Banglore", 5000),
				new Employee(5, "John Wick", "Manager", "Pune", 10000),
				new Employee(6, "John Wick", "Associate", "Nagpur", 700),
				new Employee(7, "John Wick", "Associate", "Mumbai", 10000),
				new Employee(8, "John Wick", "Senior Associate", "Banglore", 6000),
				new Employee(9, "John Wick", "Associate", "Pune", 1000),
				new Employee(10, "John Wick", "Senior Associate", "Pune", 10000), };

		return employeeList;
	}

}
