package com.java.test;

import java.util.Arrays;
import java.util.Comparator;

public class secondLargest {
    static void main() {
        int arr[] = {11, 22, 33, 23, 24, 245, 245,156};
        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}