package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverseOfEachWord {
    static void main() {
        String str="hello world Java";
//        String[] words = str.split(" ");
//for(String word:words) {
//    for (int i = word.length() - 1; i > 0; i--) {
//        System.out.print(word.charAt(i));
//    }
//    System.out.print(" ");
//}
        List<String> collect = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse().toString()).collect(Collectors.toList());

        System.out.print(collect);
    }
}
