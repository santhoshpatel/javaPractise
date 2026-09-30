package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    static void main() {
        String str="tata tech";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).filter(c->c!=' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
        String[] words=str.split(" ");
       Map<String,Integer> map=new HashMap<>();
       for (String word:words){
           char[] chars=word.toCharArray();
           for (char c:chars){
               if(!map.containsKey(c+"")){
                   map.put(c+"",1);
               }else {
                   map.put(c+"",map.get(c+"")+1);
               }
           }
       }
      //  System.out.println(map);
    }
}
