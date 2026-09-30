package com.java.practise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingChar {


//    private static Set<Character> MissingChars(String given,String input) {
//
//        Set<Character> inputchars= new HashSet<>();
//        for(char c:input.toLowerCase().toCharArray()){
//            inputchars.add(c);
//        }
//
//        Set<Character> missingChars= new LinkedHashSet<>();
//        for(char c:given.toLowerCase().toCharArray()){
//            if(!inputchars.contains(c)){
//                missingChars.add(c);
//
//            }
//        }
//        return missingChars;
//
//    }
    static void main() {

        String input="hello";
        String given="xxxxffffh";

        Set<Character> inputChars = input.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        LinkedHashSet<Character> collect = given.toLowerCase().chars().mapToObj(c -> (char) c).filter(c -> !inputChars.contains(c)).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(inputChars);
    }


}
