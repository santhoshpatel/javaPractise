package com.java.test;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    static void main() {
        List<Integer> nums =
                Arrays.asList(1,2,3,2,4,5,3);
        Set<Integer> hs= new HashSet<>();

        Set<Integer> collect = nums.stream().filter(e -> !hs.add(e)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
