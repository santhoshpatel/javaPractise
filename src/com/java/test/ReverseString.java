package com.java.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReverseString {
    static void main() {
        String str="hello world";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        String reduce = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a);
       System.out.println(reduce);
        int[] arr = {122, 3, 4, 54, 65, 78};
        List<Integer> first = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(first);
    }
}
