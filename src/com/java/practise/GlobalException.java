package com.java.practise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class GlobalException{

    static void main() {
        String str = "happy weekhend";

//        String reduce = str.chars()
//                .mapToObj(c -> String.valueOf((char) c))
//                .reduce("", (a, b) -> b + a);
//        System.out.println(reduce);
//        String[] words=str.split(" ");
//
//        for(String word:words){
//            String stringReverse= new StringBuilder(word).reverse().toString();
//            System.out.print(stringReverse);
//        }

      String reverseString=  str.chars().mapToObj(s->String.valueOf((char)s))
                .reduce("",(a,b)->b+a);

        //System.out.println(reverseString);

        String collect = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
       // System.out.println(collect);
        Map.Entry<Character, Long> characterLongEntry = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElse(null);
        System.out.println(characterLongEntry.getKey());
    }

}