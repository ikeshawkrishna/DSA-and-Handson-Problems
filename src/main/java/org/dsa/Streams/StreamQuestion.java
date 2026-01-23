package org.dsa.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestion {
    public static void main(String[] args) {
        List<Integer> distrintNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> number = Arrays.asList(1,2,3,4,4,5,6,6,7,8);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alien", "Keshaw");
        List<List<Integer>> flatNumber = Arrays.asList(
                Arrays.asList(1,2,3,4,4),
                Arrays.asList(2,3,4,6,7),
                Arrays.asList(5,8,9,10,12)
        );
        String word = "java";
        String sentence = "java is fun and java is powerful";

//<=========================================================================================>

        //Find Distrinct Elements
        List<Integer> collect = number.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("<================================================>");

        //Find Element starting with
        List<String> collect1 = names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("<================================================>");

        //Sort the element in Natural order.
        List<String> collect2 = names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
        System.out.println(collect2);
        System.out.println("<================================================>");

        //Sort the element in Reverse order.
        List<String> collect3 = names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .toList();
        System.out.println(collect3);
        System.out.println("<================================================>");

        //Flat the list and sort it
        List<Integer> collect4 = flatNumber.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(collect4);
        System.out.println("<================================================>");

        //partioningBy odd and even numbers
        Map<Boolean, List<Integer>> collect5 = distrintNumber.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(collect5);
        System.out.println("<================================================>");

        //grouping by filter letter of name
        Map<String, List<String>> collect6 = names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0,1).toLowerCase()));
        System.out.println(collect6);
        System.out.println("<================================================>");

        //Second largest element
        Integer collect7 = distrintNumber.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not Found"));

        System.out.println(collect7);
        System.out.println("<================================================>");

        //Generate a infinite stream and fetch first 10 even numbers
        List<Integer> collect8 = Stream.iterate(0, n -> n + 2)
                .limit(10)
                .toList();
        System.out.println(collect8);
        System.out.println("<================================================>");

        //find frequency of char in a word
        Map<Character, Long> collect9 = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println(collect9);
        System.out.println("<================================================>");

        //Group by Department
        Employee.employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.department))
                .forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("<================================================>");

        //Count occurence of a word in the sentence
        Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                        .forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("<================================================>");

        //find longest word in the list
        String longWordInList = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException("not found"));
        System.out.println(longWordInList);
        System.out.println("<================================================>");

        //find longest word in the sentence
        String longWordInSentence = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new RuntimeException("not found"));
        System.out.println(longWordInSentence);
        System.out.println("<================================================>");

        //find the first element greater than 10 in the list
        List<Integer> collect10 = Stream.of(2, 5, 9, 10, 11, 15, 17)
                .filter(element -> element > 10)
                .toList();
        System.out.println(collect10);
        System.out.println("<================================================>");

        Integer minnumber = distrintNumber.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("Not found"));
        System.out.println(minnumber);
        System.out.println("<================================================>");

        //Generate random number
        Stream.generate(() -> (int)(Math.random() * 900000) + 100000)
                .limit(5)
                .forEach(element -> System.out.println(element));
        System.out.println("<================================================>");

        //find the dupliacte elements in the list
        List<Integer> collect11 = number.stream()
                .filter(element -> Collections.frequency(number, element) > 1)
                .distinct()
                .toList();
        System.out.println(collect11);
        System.out.println("<================================================>");

        //Find the First Non-Repeated Characteri(eg. input : swiss   >>>>  output : w)
        String swiss = "swiss";
        Character swissnotFound = swiss.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(element -> element.getValue() == 1)
                .map(element -> element.getKey())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not Found"));
        System.out.println(swissnotFound);
        System.out.println("<================================================>");

        //Find the longest string from a list using stream operations.
        Optional<String> maxLengthString = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(maxLengthString.get());
        System.out.println("<================================================>");

        //Convert a list of User objects to a map where key = userId, value = userName.
        Map<String, String> collect12 = Users.UsersList.stream()
                .collect(Collectors.toMap(Users::getUserid, Users::getUsername));
        System.out.println(collect12);
        System.out.println("<================================================>");

        //Find common elements between two lists using stream API.
        //Method 1
        List<Integer> CombinedList = Stream.of(distrintNumber, number)
                .flatMap(List::stream)
                        .collect(Collectors.toList());

        List<Integer> distinct = CombinedList.stream()
                .filter(element -> Collections.frequency(CombinedList, element) > 1)
                .distinct()
                .toList();
                System.out.println(distinct);
        System.out.println("<================================================>");

        //Method 2
        List<Integer> list = distrintNumber.stream()
                .filter(num -> number.contains(num))
//                .filter(number::contains)
                .toList();
        System.out.println(list);

    }
}

class Users{
    String userid;
    String username;

    Users(String userid, String username){
        this.userid = userid;
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    static List<Users> UsersList = Arrays.asList(
            new Users("1", "Keshaw"),
            new Users("2", "Krishna"),
            new Users("3", "Shaw"),
            new Users("4", "Sathia")
    );

}

class Employee{
    String name;
    String department;

    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    static List<Employee> employeeList = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Blue", "Devops"),
            new Employee("Bob", "QA"),
            new Employee("Keshaw", "HR"),
            new Employee("Charlie", "HR")
    );

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}


