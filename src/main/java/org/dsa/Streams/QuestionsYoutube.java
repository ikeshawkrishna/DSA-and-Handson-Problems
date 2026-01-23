package org.dsa.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuestionsYoutube {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<List<Integer>> twoDlist = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );


//        1========================================
        Map<Boolean, List<Integer>> collect1 = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println(collect1);

//        2========================================
        Map<Boolean, List<Integer>> collect2 = IntStream.range(1, 11)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println(collect2);

//        4, 5========================================
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(numbers).summaryStatistics();
        double average = intSummaryStatistics.getAverage();
        long sum = intSummaryStatistics.getSum();
        int max = intSummaryStatistics.getMax();
        int min = intSummaryStatistics.getMin();
        long count = intSummaryStatistics.getCount();
        System.out.println("average >> " + average);
        System.out.println("sum >> " + sum);
        System.out.println("max >> " + max);
        System.out.println("min >> " + min);
        System.out.println("count >> " + count);

//        7===========================================
        List<Integer> collect3 = Arrays.stream(numbers)
                .map(number -> number * number)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect3);

//        8==========================================
        int sum1 = Arrays.stream(numbers)
                .map(number -> number * number)
                .sum();
        System.out.println(sum1);

//        9==========================================
        Integer secondMax = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow(() -> new NoSuchElementException());
        System.out.println(secondMax);

//        11=========================================
        int sum2 = twoDlist.stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);

//        12=========================================
        Map<Integer, Integer> collect4 = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toMap(ele -> ele, num -> num * num));
        System.out.println(collect4);

//        14=========================================
        int multiplyusingreduce = Arrays.stream(numbers)
                .boxed()
                .reduce(1, (a, b) -> a * b).intValue();
        System.out.println(multiplyusingreduce);
    }
}
