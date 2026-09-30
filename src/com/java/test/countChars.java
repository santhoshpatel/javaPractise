package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countChars {
    static void main() {
        String str = "java java s";
        String string="swiss";
//        Map<Character, Long> collect = str.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> c != ' ')
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//       System.out.println(collect);
//        Character c1 = str.chars().mapToObj(c -> (char) c)
//                .filter(c -> c != ' ')
//                .filter(c -> collect.get(c) == 1)
//                .findFirst().orElse(null);
//        System.out.println(c1);

        Map<Character, Long> collect = string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character c1 = string.chars().mapToObj(c -> (char) c).filter(c -> collect.get(c) == 1).findFirst().orElse(null);

        System.out.println(c1);
    }

//    public static class Base {
//
//        static void main() {
//            String str="swiss";
//
//            Map<Character, Long> frequency = str.chars().mapToObj(c -> (char) c)
//                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//            Character c1 = str.chars().mapToObj(c -> (char) c).filter(c -> frequency.get(c) == 1)
//                    .findFirst().orElse(null);
//            System.out.println(c1);
//
//        }
//    }
//
//    public static class test {
//        static void main() {
//            List<Integer> list = Arrays.asList(4, 8, 88, 9, 8, 6, 55, 88, 55, 4, 9);
//            Map<Integer, Long> collects = list.stream()
//                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//            Optional<Integer> first = list.stream().filter(n -> collects.get(n) == 1).findFirst();
//
//            System.out.println(first.get());
//        }
//    }
}
