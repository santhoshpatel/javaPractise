package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenOrAdd {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 44, 9, 7, 3, 4);
        //System.out.println(list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().collect(Collectors.groupingBy(n -> n % 2 == 1)));
    }
}
