package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
//Creating objects for my Employee Class
		int x;
		x = 50;

		Employee employee;
		employee = new Employee();// an employee object is created
		System.out.println("id" + employee.id);
		System.out.println("name" + employee.name);
		System.out.println("department" + employee.department);
		System.out.println("gender" + employee.gender);
		System.out.println("salary" + employee.salary);
		System.out.println("age" + employee.age);
	
		
	
	}
	

}
