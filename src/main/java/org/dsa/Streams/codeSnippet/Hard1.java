package org.dsa.Streams.codeSnippet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Hard1 {

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();

		Optional<Entry<String, Long>> collect = employees.stream()
				.collect(Collectors.groupingBy(
						e -> e.getName().substring(0, 1), 
						Collectors.counting())
				).entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue));
		System.out.println(collect.get());
	}
}
