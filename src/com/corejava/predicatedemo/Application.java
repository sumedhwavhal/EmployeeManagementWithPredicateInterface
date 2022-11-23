package com.corejava.predicatedemo;

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		
		CreateEmployees createEmployees = new CreateEmployees();
		List<Employee> employeeList = new ArrayList<Employee>();
		Collections.addAll(employeeList, createEmployees.importEmployees());
		System.out.println("All Employees: ");
		for(Employee e : employeeList) {
			System.out.println(e);
		}
		System.out.println("**********************************************************");
		
		//Get Employees who are Managers
		Predicate<Employee> getManagers = employee -> employee.getDesignation().equalsIgnoreCase("manager");
		System.out.println("Employees who are Managers");
		display(getManagers, employeeList);
		
		//Get Employees who are from Pune
		Predicate<Employee> puneEmployees = employee -> employee.getCity().equalsIgnoreCase("pune");
		System.out.println("Employees who are from Pune");
		display(puneEmployees, employeeList);
		
		//Get Employees whose salary is greater than 1000
		Predicate<Employee> salaryGreaterThanThousand = employee -> employee.getSalary()>1000;
		System.out.println("Employees with salary greater than 1000");
		display(salaryGreaterThanThousand, employeeList);
		
		//Get Employee who are managers and are from pune
		System.out.println("Managers from Pune");
		display(puneEmployees.and(getManagers), employeeList);
		
		//Employees from Pune with salary greater than 1000
		System.out.println("Pune employees with salary greater than 1000");
		display(puneEmployees.and(salaryGreaterThanThousand), employeeList);
		
		//Employees who are not from Pune
		System.out.println("Employees who are not from Pune");
		display(puneEmployees.negate(), employeeList);
		
		//Employees who are Associates or are from Pune
		System.out.println("Employees who are not Managers and are from Pune");
		display(getManagers.negate().and(puneEmployees), employeeList);
	}
	
	public static void display(Predicate<Employee> p, List<Employee> list) {
		for(Employee e : list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**********************************************************");
	}

}
