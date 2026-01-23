package org.dsa.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        Function<String, String> myFun = s -> s;

        String word = "java";
        String sentence = "java is good and java is powerful";

        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(e -> System.out.println(e + " "));


        Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach(
                        (k, v) -> {
                            System.out.println("key : " + k + " value : " + v);
                        });


        Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .forEach(
                        (k, v) -> {
                            System.out.println("key : " + k + " value : " + v);
                        });

        Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException("not found"));
    }
}
