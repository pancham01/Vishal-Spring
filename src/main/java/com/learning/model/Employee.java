package com.learning.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {

	private int id = 1;
	private String name = "Vishal", gender = "male";
	private int salary = 44;

	@Autowired
	private Address add;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}

	public void setAddress(Address add) {
		this.add = add;
		System.out.println("Employee.setAddress()");
	}

	
	public Employee(Address add) {
		this.add = add;
		System.out.println("Employee.Employee(1)");
	}

}
