package com.java.javaPractise;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Recall {
    static void main(String[] args) {
        String str="sandy patel";
        String s = "programming";// Range is 'a' to 'h', missing: 'f', 'g'

        //int[] nums={1,3,0,4,5,0,8,2,4,2};
        List<Integer> list = Arrays.asList(1, 3, 0, 4, 5, 0, 8, 2, 4, 2);

        List<Integer> collect6 = Stream.concat(list.stream().filter(n -> n != 0), list.stream().filter(n -> n == 0)).collect(Collectors.toList());
        //System.out.println(collect6);
        int[] nums = {1, 2, 4, 6, 3, 7, 8,2};
        String reduce = str.chars().mapToObj(s2 -> String.valueOf((char) s2)).reduce("", (a, b) -> b + a);
       // System.out.println(reduce);

       String collect = Arrays.stream(str.split(" ")).map(s4 -> new StringBuilder(s4).reverse().toString()).collect(Collectors.joining(" "));
        //System.out.println(collect);
       // Map.Entry<Character, Long> characterLongEntry = str.chars().mapToObj(s -> (char) s).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
           //     .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().orElse(null);
       // System.out.println(characterLongEntry.getKey());

       /* @RestControllerAdvice
       public class ExceptionClass{

       @ExceptionHandler(UserNotFoundException.Class)
       public ResponseEntity<ErrorResponse> handlerNotFound(){
       ErrorResponse error= new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage(),localDateTime.now());;
       return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
       }
        */
        int[] array = IntStream.concat(Arrays.stream(nums).filter(n -> n != 0), Arrays.stream(nums).filter(n -> n == 0)).toArray();
      // System.out.println(Arrays.toString(array));

        Integer i = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
       //System.out.println(i);
        Set hs= new HashSet();
        int[] array1 = Arrays.stream(nums).filter(n -> hs.add(n)).toArray();
        System.out.println(Arrays.toString(array1));
        Set<Integer> collect2 =Arrays.stream(nums).boxed().distinct().collect(Collectors.toSet());
       // System.out.println(collect2);
        int i1 = IntStream.rangeClosed(1, nums.length+1).sum() - Arrays.stream(nums).sum();
       // System.out.println(i1);
//        IntStream.rangeClosed('a', 'p')
//                .filter(c -> s.indexOf(c) == -1)
//                .forEach(c -> System.out.print((char) c + " "));

        Integer i2 = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).findFirst().orElse(null);

        Map<Integer, Long> collects = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // System.out.println(collect);
        List<Map.Entry<Character, Long>> collect3 = s.chars().mapToObj(m -> (char) m).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 2).collect(Collectors.toList());

        Map<Boolean, Long> collect4 = s.toLowerCase().chars().filter(Character::isLetter)
                .boxed()
                .collect(Collectors.partitioningBy(e -> "aeiou".indexOf(e) != -1, Collectors.counting()));
//        System.out.println("Vowels"+collect4.get(true));
//        System.out.println("Constants"+collect4.get(false));

        Map<Boolean, List<Integer>> collect5 = Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));
      //  System.out.println("even numbers"+collect5.get(true));
    }
}
