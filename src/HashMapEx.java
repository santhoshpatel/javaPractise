import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapEx {
    static void main() {

                HashMap map = new HashMap();

                map.put(1L, "1");
                map.put("1", "1");
                map.put((char)'1', "1");
                map.put("1", "1");

        Map<Object, Object> result = (Map<Object, Object>) map.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey,
                        (oldKey, newKey) -> oldKey
                ));

        System.out.println(result);
          // Tell me the output with before java8 and after java8
               System.out.println(map.size());
            }
        }

