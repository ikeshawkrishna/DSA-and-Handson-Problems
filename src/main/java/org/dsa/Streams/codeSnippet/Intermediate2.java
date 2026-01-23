package org.dsa.Streams.codeSnippet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intermediate2 {

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();

		String fruit = "banana";

		// Highest paid employee in each dept
		Map<String, Optional<Employee>> highestPaidEmployee = employees.stream()
				.collect(
					Collectors.groupingBy(
						Employee::getDept, 
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))
					)
				);
		System.out.println(highestPaidEmployee);

		// department more than 2 employees
		List<String> deptHavingMoreThan2 = employees.stream()
				.collect(Collectors.groupingBy(
							Employee::getDept, 
							Collectors.counting()
						)).entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.map(e -> e.getKey())
				.toList();
		System.out.println(deptHavingMoreThan2);

		// department with high average salary
		Entry<String, Double> entry = employees.stream()
				.collect(Collectors.groupingBy(
						Employee::getDept, 
						Collectors.averagingDouble(Employee::getSalary))
				).entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue))
				.get();
		System.out.println(entry);

		// character appeared max in a string
		Optional<Character> max = fruit.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue)).map(e -> e.getKey());
		System.out.println(max.get());

		// Character appeared more than 1 times
		Map<Character, Long> collect = "Dddjkk".toLowerCase().chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(collect);
	}

}
