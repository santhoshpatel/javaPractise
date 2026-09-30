package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryExample {
    static void main() {
        List<Employee> employees= Arrays.asList(
                new Employee("santhosh",39,34000),
                new Employee("rahul",56,56700),
                new Employee("mahesh",30,30000),
                new Employee("rahul",26,50000)
        );

        List<Double> collect = employees.stream().filter(emp -> emp.getAge() >= 35)
                .map(employee -> employee.getSalary()).collect(Collectors.toList());
        System.out.println(collect);

        Map<String, Double> collect1 = employees.stream().filter(emp -> emp.getAge() >= 35)
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(collect1);

        double v = employees.stream().filter(employee -> employee.getAge() >= 35)
                        .mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(v);
    }




}
