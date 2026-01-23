package org.dsa.Streams;

import com.sun.jdi.Value;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AdvancedQuestion {

    public static void main(String[] args) {
        Map<String, String> demomap = Map.ofEntries(
                Map.entry("Keshaw","DEV"),
                Map.entry("Krishna","DEVOPS"),
                Map.entry("Shaw","Cloud")
        );

        Set<Map.Entry<String, String>> entries = demomap.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, String> temp : entries) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

        List<Person> personList = Arrays.asList(
                new Person("Keshaw", 23, 50000),
                new Person("Krishna", 23, 51000),
                new Person("shaw", 23, 50000),
                new Person("Sathia", 25, 60000),
                new Person("Bala", 24, 40000),
                new Person("Madesh", 24, 30000),
                new Person("shamil", 27, 59000));

        Map<Integer, List<Person>> personMap = personList.stream()
                .collect(Collectors.groupingBy(ele -> ele.getAge()));

        System.out.println(personMap);

        // Way 1
        Map<Integer, List<Person>> collect = personMap.entrySet().stream()
                .collect(Collectors.toMap(ele -> ele.getKey(),
                        e -> e.getValue().stream()
                                .filter(p -> p.getSalary() > 50000)
                                .toList()
                ));
        System.out.println(collect);

        // Way 2
        Map<Integer, List<Person>> collect1 = personMap.entrySet().stream()
                .map(mapval -> Map.entry(
                        mapval.getKey(),
                        mapval.getValue().stream()
                                .filter(val -> val.getSalary() > 50000)
                                .toList()
                ))
                .filter(entry -> !entry.getValue().isEmpty())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        System.out.println(collect1);




    }


}

class Person {
    private String name;
    private int age;
    private long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Person(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }


}
