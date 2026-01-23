package org.dsa.Streams.codeSnippet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SuperEasy {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//		Find the even numbers
		List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
		System.out.println(evenNumbers);

//		Square the numbers
		List<Integer> squares = numbers.stream().map(number -> number * number).toList();
		System.out.println(squares);
		
//		Even Square numbers
		List<Integer> evenSquareNumbers = numbers.stream()
			.filter(number -> number%2==0)
			.map(number -> number * number)
			.toList();
		System.out.println(evenSquareNumbers);
		
//		first element greater than 10
		Integer firstGreaterthan10 = numbers.stream()
			.filter(number -> number > 5)
			.sorted()
			.findFirst().orElse(-1);
		System.out.println(firstGreaterthan10);
		
//		count number greater than 5
		long numbercountGreaterThan5 = numbers.stream()
			.filter(num -> num > 5)
			.count();
		System.out.println(numbercountGreaterThan5);
		
//		find sum/product of element in list
		Integer sum = numbers.stream()
			.reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
//		sum of even numbers
		Integer evensum = numbers.stream()
			.filter(num -> num % 2 == 0)
			.reduce(0 ,(a, b) -> a+b);
		System.out.println(evensum);
		
//		Max of the number
		Integer maxNumberList = numbers.stream()
			.reduce(0, (a,b) -> Integer.max(a, b));
		System.out.println(maxNumberList);
		
//		sum of square of even numbers
		Integer evenSquareSum = numbers.stream()
			.filter(num -> num % 2 == 0)
			.map(num -> num * num)
			.reduce((a,b) -> a + b)
			.orElse(-1);
		System.out.println(evenSquareSum);
	}
}
