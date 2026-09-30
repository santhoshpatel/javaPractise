package Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class failFastFailSafe {
    static void main() {
        List<String> listNames = Arrays.asList("namu", "coder", "sam","sam","namu","ram");
        Set<String> hs= new HashSet<>();
        List<String> collect = listNames.stream()
               // .map(String::trim)
                .filter(e -> !hs.add(e)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
