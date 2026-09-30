package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxAndMin {
    static void main() {
        //int arr[] = {23, 43, 54, 64, 666, 665, 90, 7};
        List<Integer> list = Arrays.asList(23, 43, 54, 64, 666, 665, 90, 7);
//        OptionalInt max = Arrays.stream(arr).max();
//        System.out.println(max.getAsInt());

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        Optional<Integer> min=list.stream().min(Integer::compareTo);
       System.out.println(max.get()+"\n"+ min.get());



    }
}
