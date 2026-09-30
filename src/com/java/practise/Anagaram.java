package com.java.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagaram {
    static void main() {
        String s="madam";
        String s1="listen";//eilnst
        String s2="silents";//eilnsst
        boolean result =s1.chars().sorted().boxed().toList().equals(s2.chars().sorted().boxed().toList());
       // System.out.println(result);
        boolean equals = s.equals(new StringBuilder(s).reverse().toString());
      //  System.out.println(equals);
String s3="hello world";

        String reduce = s3.chars().mapToObj(c -> String.valueOf((char) c)).reduce(" ", (a, b) -> b+a);

        System.out.println(reduce);
        List<String> collect = Arrays.stream(s3.split(" ")).map(s5 -> new StringBuilder(s5).reverse().toString()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
