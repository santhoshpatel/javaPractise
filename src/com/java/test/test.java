package com.java.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//descending and remove duplicates
public class test {
    static void main() {
        List<Integer> list = Arrays.asList(12, 3, 77, 44, 44, 77, 68, 90, 90, 100);
        String s="JavawordJava JavawordJava";
        List<String> strings = Arrays.asList("java", "SpringBoot", "spring");
        //  list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        List<Integer> collect = list.stream()
//                .filter(e -> e % 2 == 1)
//                .map(e -> e * 2).collect(Collectors.toList());

//        List<Integer> collect = list.stream()
//                .skip(1)
//                .limit(2)
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        Optional<Integer> first = list.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//        if(first.isPresent()){
//            System.out.println(first.get());
//        }
//        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
//        System.out.println(collect);
//        Optional<String> max = strings.stream().max(Comparator.comparing(eleme -> eleme.length()));
//        max.ifPresent(System.out::println);
        List<Employee> employees = Arrays.asList(
                new Employee("anthosh", 39, 34000),
                new Employee("anil", 56, 56700),
                new Employee("mahesh", 30, 53000),
                new Employee("naveen", 26, 50000)
        );
//        List<Employee> collect = employees.stream()
//                .filter(employee -> employee.getSalary() > 50000)
//                .limit(1)
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        List<Employee> collect = employees.stream()
//                .sorted(Comparator.comparingDouble(employee -> -1 *  employee.getSalary()))
//                .limit(2).collect(Collectors.toList());
//        System.out.println(collect);
//        List<Employee> sorted = employees.stream()
//                .sorted((emp1, emp2) -> {
//                    if (emp1.getSalary() > emp2.getSalary()) {
//                        return 1;
//
//                    } else if (emp1.getSalary() < emp2.getSalary()) {
//                        return -1;
//
//                    } else {
//                        return emp1.getName().compareTo(emp2.getName());
//                    }
//                }).collect(Collectors.toList());
//        System.out.println(sorted);

//        Map<Integer, Long> result = list.stream()
//                .collect(Collectors.groupingBy(emp -> emp, Collectors.counting()));
//        System.out.println(result);
//        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//        System.out.println(collect);

    }
}

