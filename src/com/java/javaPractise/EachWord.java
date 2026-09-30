package com.java.javaPractise;

import java.util.Arrays;
import java.util.List;

public class EachWord {
    static void main() {
        String str="hello world";
        String reduce = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> (b + a));
        System.out.println(reduce);
        List<StringBuilder> list = Arrays.stream(str.split(" ")).map(s -> new StringBuilder(s).reverse()).toList();
        System.out.println(list);

    }
}
