package meow;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1, "Aaryan");
        tm.put(2, "Arush");
        tm.put(3, "Aditya");

        tm.forEach((k, v) -> {
            System.out.println("Key : " + k + ", Value: " + v);
        });
    }
}
