package org.dsa.Streams.codeSnippet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Easy {

	public static void main(String[] args) {
		List<Integer> duplicates = Arrays.asList(5,2,8,2,5,9,3);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
		List<List<Integer>> flatnumbers = Arrays.asList(
					Arrays.asList(1,2,3,4),
					Arrays.asList(5,6),
					Arrays.asList(7,8,9)
				);

//		distinct elements / remove duplicates
		List<Integer> distinctIntegers = duplicates.stream()
			.distinct()
			.toList();
		System.out.println(distinctIntegers);
//		duplicates.stream()
//		.collect(Collectors.toSet());
		
//		average of the list
		double average = numbers.stream()
			.mapToInt(Integer::intValue)
			.average()
			.orElse(-1);
		System.out.println(average);
		
//		sort number by asc / desc
		List<Integer> sortedAsc = numbers.stream()
			.distinct()
			.sorted()
			.toList();
		
		List<Integer> sortedDesc = numbers.stream()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.toList();
		
//		count strings starts with 'A'
		long countOfString = fruits.stream()
			.filter(fruit -> fruit.startsWith("a"))
			.count();
		System.out.println(countOfString);
		
//		join all string using ,
		String commoFruites = fruits.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(commoFruites);
		
//		check if all elements are positive
		boolean isNumbersPositive = numbers.stream().allMatch(num -> num > 0);
		System.out.println(isNumbersPositive);
		
//		check if any number is divisible by 3
		boolean isAnyNumberDivibeBy3 = numbers.stream()
			.anyMatch(num -> num % 3 == 0);
		System.out.println(isAnyNumberDivibeBy3);
		
//		Flatten the list of list
		List<Integer> flattedList = flatnumbers.stream()
			.flatMap(list -> list.stream())
			.distinct()
			.sorted()
			.toList();
		System.out.println(flattedList);
		
//		second highest number in list
		Integer secondHighest = numbers.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst().orElse(-1);
		System.out.println(secondHighest);
	}
}
