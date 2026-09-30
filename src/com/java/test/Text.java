package com.java.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Text {
    static void main() {

//        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//        Map<String, Long> collect = items.stream()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//        System.out.println(collect);
//        LinkedHashMap<String, Long> collect1 = items.stream()
//                .sorted(Comparator.comparingInt(item -> Collections.frequency(items, items)).reversed())
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        System.out.println(collect1);
        String str="swiss";
        Map.Entry<Character, Long> characterLongEntry = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().orElse(null);

        System.out.println(characterLongEntry.getKey());
    }
}
