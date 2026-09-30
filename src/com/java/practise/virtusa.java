package com.java.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class virtusa {
    static void main() {
        String str = "happy weekend";

        String result = Arrays.stream(str.split(" "))
                .sorted(Comparator.reverseOrder()).peek(System.out::println)
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
