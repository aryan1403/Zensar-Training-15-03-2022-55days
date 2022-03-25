package meow;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapex {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Aaryan", 123456789);
        map.put("Bobby", 1234);
        map.put("Aditya", 1234);

        System.out.println("Aaryan = " + map.get("Aaryan"));
        System.out.println(map.containsKey("Aaryan"));
        System.out.println(map.containsValue(1234));

        Collection<Integer> col = map.values();
        System.out.println(col);

        Set<String> set = map.keySet();
        System.out.println(set);

        map.forEach((k, v) -> {
            System.out.println("Key = " + k + ", Value = " + v);
        });
    }
}
