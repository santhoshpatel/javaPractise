package com.java.javaPractise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDetails {
    static void main() {
        List<Employees> employees = Arrays.asList(
                new Employees(1, "santhosh", "IT", 39000, "Male","Bengalore"),
                new Employees(2, "Shivani", "QA", 56000, "Female","Hyderabad"),
                new Employees(33, "mahesh", "DEV", 30999, "Male","Mumbai"),
                new Employees(55, "rahul", "HR", 26000, "Male","Hyderabad"),
                new Employees(1, "sam", "IT", 20000, "Male","Chennai"),
                new Employees(2, "ravi", "QA", 76000, "Female","Bengalore"),
                new Employees(33, "kiran", "DEV", 90999, "Male","Delhi"),
                new Employees(55, "kittu", "SALES", 66000, "Male","Bengalore"),
                new Employees( 1,"santhosh","IT",40000,"Male","Secundrabad")
        );

        Map<String, Map<String, Optional<Employees>>> result = employees.stream().collect(Collectors.groupingBy(Employees::department, Collectors.groupingBy(Employees::city, Collectors.maxBy(Comparator.comparing(Employees::salary)))));
        //result.forEach((department, cities) -> {
                  //  System.out.println("Department: " + department);

//                    cities.forEach((city, employee) ->
//                            System.out.println(
//                                    "  City: " + city +
//                                            " | Employee: " + employee +
//                                            " | Salary: " + employee
//                            )
//                    );
//                });
        Map<String, Optional<Employees>> collect4 = employees.stream().collect(Collectors.groupingBy(Employees::department, Collectors.maxBy(Comparator.comparing(Employees::salary))));
       // System.out.println(collect4);

        Map<Character, Long> collect3 = employees.stream().map(e -> e.name().charAt(0)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      //  System.out.println(collect3.entrySet().stream().max(Map.Entry.comparingByValue()).get());
        List<Map.Entry<String, Long>> list = employees.stream().collect(Collectors.groupingBy(Employees::department, Collectors.counting())).entrySet().stream().filter(l -> l.getValue() > 1).toList();

       // System.out.println(list);
        Map<String, Optional<Employees>> collect2 = employees.stream().collect(Collectors.groupingBy(Employees::department, Collectors.maxBy(Comparator.comparingDouble(Employees::salary))));



        Set<Employees> hs=new HashSet<>();
        for(Employees emp :employees){
            hs.add(emp);

        }
       // System.out.println(hs);
        Map<String, List<Employees>> collect = employees.stream().filter(employees1 -> employees1.salary() > 76000).collect(Collectors.groupingBy(Employees::department));
       // System.out.println(collect);
        Map<String, Long> test = employees.stream().filter(employees1 -> employees1.name().equalsIgnoreCase("santhosh")).collect(Collectors.groupingBy(e -> e.department(), Collectors.counting()));
        //System.out.println(test);

        //Map<String, List<Employees>> collect = employees.stream().collect(Collectors.groupingBy(Employees::gender));
//        //System.out.println(collect);
       List<Employees> collect1 = employees.stream().filter(employees1 -> employees1.salary() > 35000).collect(Collectors.toList());
//       // System.out.println(collect1);
//        Map<String, Long> collect2 = employees.stream()
//                .collect(Collectors.groupingBy(Employees::department, Collectors.counting()));
//       // System.out.println(collect2);
//        Map<String, Optional<Employees>> collect3 = employees.stream()
//                .collect(Collectors.groupingBy(Employees::name, Collectors.maxBy(Comparator.comparingDouble(Employees::salary))));
//       // System.out.println(collect3);
        Optional<Double> first = employees.stream()
                .map(Employees::salary)
                .distinct()
                .sorted(Comparator.reverseOrder()).skip(1)
                .findFirst();
      // System.out.println(first.get());
//
//        Map<String, Optional<Employees>> collect4 = employees.stream()
//                .collect(Collectors.groupingBy(Employees::department, Collectors.maxBy(Comparator.comparingDouble(Employees::salary))));
//        System.out.println(collect4);
    }
}
