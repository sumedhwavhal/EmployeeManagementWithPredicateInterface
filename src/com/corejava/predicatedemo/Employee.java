package com.corejava.predicatedemo;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private String city;
	private int salary;

	public Employee(int id, String name, String designation, String city, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", city=" + city + ", salary="
				+ salary + "]";
	}

}
