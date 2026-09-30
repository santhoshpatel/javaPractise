package com.java.practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Basics {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 25, 85, 30, 40, 15,40);
        List<String> names = Arrays.asList("Ram", "John", "Alex","Ram", "John", "Raj", "Kiran", "Amit");

        Set hashSet = new HashSet<>();
        Set<String> collect1 = names.stream().filter(name -> hashSet.add(name)).collect(Collectors.toSet());
        //System.out.println(collect1);
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
       // System.out.println(collect);
        // numbers.stream().filter(n -> n > 20).forEach(System.out::println);
        //names.forEach(n->System.out.println(n+"-"+n.length()));
        // names.stream().map(n -> n.length()).forEach(System.out::println);
       // numbers.stream().distinct().forEach(System.out::println);
        // numbers.stream().sorted().forEach(System.out::println);
        //numbers.stream().filter(n->n>25).forEach(System.out::println);
        //names.stream().map(n->n.toUpperCase()).forEach(System.out::println);
       // numbers.stream().filter(s->s.toString().startsWith("1")).forEach(System.out::println);
        List<Integer> list = numbers.stream().filter(n -> Collections.frequency(numbers, n) == 1).toList();
        System.out.println(list);
    }
}
