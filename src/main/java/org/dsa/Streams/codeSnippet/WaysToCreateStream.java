package org.dsa.Streams.codeSnippet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStream {
	
	public static void main(String[] args) {

		//Ways to create the stream
		//1. List -> Stream
		List<String> names = Arrays.asList("alice","bob");
		Stream<String> namesStream = names.stream();
		
		//2. Arrays -> Stream
		String[] lang = {"Java", "Python", "C++"};
		Stream<String> stream = Arrays.stream(lang);
		
		//3. Stream.of()
		Stream<Integer> streamOf = Stream.of(1,2,3,4,5);
		
		//4. Stream generate
		Stream<Double> randomStream = Stream.generate(Math::random).limit(5);
	}

}