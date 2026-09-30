package com.java.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestElementInArray {


    public static void main(String[] args) {

        int[] arr = {122, 3, 4, 54, 65, 78};
        Optional<Integer> first = Arrays.stream(arr)
                 .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder()).skip(1)
                .findFirst();
        first.ifPresent(System.out::println);

    }

}
