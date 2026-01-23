package org.dsa.Streams.codeSnippet;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Employee{
		
	private int id;
	private String name;
	private double salary;
	private String dept;
	
	public static List<Employee> getEmployees(){
		return Arrays.asList(
				new Employee(1, "Alice Johnson", 55000, "HR"),
				new Employee(2, "Bob Smith", 62000, "DEV"),
				new Employee(3, "Carol White", 48000, "Testing"),
				new Employee(4, "David Brown", 71000, "DEV"),
				new Employee(5, "Emma Davis", 59000, "HR"),
				new Employee(6, "Frank Miller", 65000, "DEV"),
				new Employee(7, "Grace Lee", 52000, "Testing"),
				new Employee(8, "Henry Wilson", 68000, "DEV"),
				new Employee(9, "Ivy Martinez", 54000, "Testing"),
				new Employee(10, "Jack Taylor", 73000, "HR")
			);
	}
}
