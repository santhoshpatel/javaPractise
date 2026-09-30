package com.java.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsTest {
    static void main() {
        List<Integer> nums = Arrays.asList(11, 2, 23, 5, 87, 6, 9, 6);
//        nums.stream()
//                .sorted()
//                .filter(n-> Collections.frequency(nums,n)==1)
//                .forEach(n-> System.out.println(n));

        Map<Integer,Long> charcount = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charcount);
    }
}
