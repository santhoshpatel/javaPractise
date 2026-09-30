package com.java.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tes {
    static void main() {
        String name="swiss";
        int[] arr = {122, 3,4, 4, 54, 65, 78};
        List<Integer> list = Arrays.asList(1, 4, 7, 8, 7, 3, 8, 66);

//        Map<Character, Long> frquencychars = name.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        Character c1 = name.chars()
//                .mapToObj(c -> (char) c)
//                .filter((e -> frquencychars.get(e) == 1)).findFirst().orElse(null);
//        System.out.println(c1);
        Integer i = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        System.out.println(i);
        List<Integer> collect = list.stream()
                .filter(e -> Collections.frequency(list, e) == 1)
                .collect(Collectors.toList());
        System.out.println(collect);

        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}
