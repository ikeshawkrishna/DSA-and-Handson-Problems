package org.dsa.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapRelatedQuestion {

    public static void main(String[] args) {
        Map<String, Integer> nameAgeMap = Map.ofEntries(
                Map.entry("Keshaw", 23),
                Map.entry("Krishna", 24),
                Map.entry("Shaw", 25),
                Map.entry("Kesavan", 9)
        );
        Map<String, Integer> nameAgeMap2 = Map.ofEntries(
                Map.entry("Sathia", 25),
                Map.entry("Kesavan", 10)
        );

        List<Employee_pojo> empList = Arrays.asList(
                new Employee_pojo(1, "Keshaw"),
                new Employee_pojo(2, "Krishna"),
                new Employee_pojo(3, "Shaw"),
                new Employee_pojo(4, "Kesavan")
        );

        List<Student> students = Arrays.asList(
                new Student("Keshaw", "A1"),
                new Student("Krishna", "A1"),
                new Student("shaw", "A2")
        );

        List<Person> personList = Arrays.asList(
                new Person("Keshaw", 23, 50000),
                new Person("Krishna", 23, 51000),
                new Person("shaw", 23, 50000),
                new Person("Sathia", 25, 60000),
                new Person("Bala", 24, 40000),
                new Person("Madesh", 24, 30000),
                new Person("shamil", 27, 59000));

        List<Person> personList2 = Arrays.asList(
                new Person("Bala", 24, 40000),
                new Person("Madesh", 24, 30000),
                new Person("shamil", 27, 59000));

        FilterMapBYKeyORValue(nameAgeMap);
        ConvertListToMap(empList);
        SortByValues(nameAgeMap);
        ConvertMapValues(nameAgeMap);
        findMinMaxValueOfMap(nameAgeMap);
        flatMapOfList(returnMapList());
        countFreqOfEachCharacter("swiss");
        partitionOfMap(nameAgeMap);
        mergeTwoMaps(nameAgeMap,nameAgeMap2);
        countStudentsByGrade(students);
        countStudentsByGrade1(students);
        topNPaidEmployee(personList,3);
        countWordFreqInPara("Java is Good and Java is PowerFul");
    }

    static void FilterMapBYKeyORValue(Map<String, Integer> nameAgeMap) {
        Map<String, Integer> Collect = nameAgeMap.entrySet().stream()
                .filter(name -> name.getValue() > 20)
//                .collect(Collectors.toMap(key -> key.getKey(), value -> value.getValue()));
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Collect.entrySet().stream()
                .forEach((ele) -> {
                    System.out.println(ele.getKey() + " " + ele.getValue());
                });
        System.out.println("<==================>");
    }

    static void ConvertListToMap(List<Employee_pojo> empList) {
        Map<Integer, String> collect = empList.stream()
                .collect(Collectors.toMap(Employee_pojo::getId, Employee_pojo::getName));

        collect.entrySet().stream()
                .forEach(System.out::println);
        System.out.println("<==================>");
    }

    static void SortByValues(Map<String, Integer> nameAgeMap) {

        LinkedHashMap<String, Integer> collect = nameAgeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                ele -> ele.getKey(),
                                ele -> ele.getValue(),
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println(collect);
    }

    //    Convert Map<String, Integer> to Map<String, String> where value becomes "High" if > 80 else "Low"
    static void ConvertMapValues(Map<String, Integer> nameAgeMap) {
        Map<String, String> collect = nameAgeMap.entrySet().stream()
                .map(ele -> Map.entry(
                        ele.getKey(),
                        (ele.getValue() > 18) ? "Major" : "Minor"
                ))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect);
    }

    static void findMinMaxValueOfMap(Map<String, Integer> nameAgeMap){
        Map.Entry<String, Integer> MaxEntry = nameAgeMap.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        Map.Entry<String, Integer> MinEntry = nameAgeMap.entrySet().stream()
                .min(Map.Entry.comparingByValue()).get();
        System.out.println(MaxEntry);
        System.out.println(MinEntry);
    }

    static void flatMapOfList(Map<Integer, List<Person>> returnMapList){
        List<Person> list = returnMapList.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .toList();

        System.out.println(list);
    }

    static void countFreqOfEachCharacter(String name){
        Map<String, Long> freqMap = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(element -> element,Collectors.counting()));
        System.out.println(freqMap);
    }

    static void partitionOfMap(Map<String, Integer> nameAgeMap){
        Map<Boolean, List<Map.Entry<String, Integer>>> collect = nameAgeMap.entrySet().stream()
                .collect(Collectors.partitioningBy(element -> element.getValue() >= 18));
        System.out.println(collect);
    }

    static void mergeTwoMaps(Map<String, Integer> nameAgeMap, Map<String, Integer> nameAgeMap1){
        Stream<Map.Entry<String, Integer>> concat = Stream.concat(nameAgeMap.entrySet().stream(), nameAgeMap1.entrySet().stream());
        Map<String, Integer> collect = concat.collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1
                ));

        System.out.println(collect);

    }

    static void countStudentsByGrade(List<Student> students){
        Map<String, Long> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));
        System.out.println(collect);
    }

    static void countStudentsByGrade1(List<Student> students){
        Map<String, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
        System.out.println(collect);
    }

    static void topNPaidEmployee(List<Person> returnMapList, int topN){
        System.out.println(returnMapList.stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(topN)
                .toList());
    }

    static void findCommonBetweenTwoList(List<Person> personList1, List<Person> personList2){
        List<Person> commom = new ArrayList<>();
        personList1.stream()
                .forEach(ele -> {
                    if(personList2.contains(ele)){
                        commom.add(ele);
                    }
                });
    }
    
    static void countWordFreqInPara(String para){
        Map<String, Long> collect = Arrays.stream(para.split(" "))
                .collect(Collectors.groupingBy(ele -> ele, Collectors.counting()));
        System.out.println(collect);
    }

    static Map<Integer, List<Person>> returnMapList(){
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

        Map<Integer, List<Person>> collect1 = personMap.entrySet().stream()
                .map(mapval -> Map.entry(
                        mapval.getKey(),
                        mapval.getValue().stream()
                                .filter(val -> val.getSalary() > 50000)
                                .toList()
                ))
                .filter(entry -> !entry.getValue().isEmpty())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return collect1;
    }


}

class Employee_pojo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee_pojo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student{
    private String name;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}