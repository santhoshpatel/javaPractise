package com.java.javaPractise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFreencyChar {

    static void main() {
        String str="banana";
        Optional<Map.Entry<Character, Long>> max = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()
                )).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(max);
    }
}
