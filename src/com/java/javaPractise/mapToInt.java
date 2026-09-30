package com.java.javaPractise;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mapToInt {
    static void main() {
        Integer[] integer ={1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(integer).mapToInt(Integer::intValue);
        System.out.println(intStream.boxed().collect(Collectors.toList()));

    }
}
