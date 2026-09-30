package com.java.javaPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {
    static void main() {
        int [] array={1,2,5,2,4,7,1};
        List<Map.Entry<Integer, Long>> collect = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toList());
        //System.out.println(collect);
       // Arrays.stream(array).distinct().forEach(System.out::println);
        String a="aabbbcc";
        String collect1 = a.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().map(e -> e.getKey() + String.valueOf(e.getValue())).collect(Collectors.joining());
        a.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().map(e->e.getKey()+String.valueOf(e.getValue())).forEach(System.out::print);

       // System.out.println(collect1);
    }
}
