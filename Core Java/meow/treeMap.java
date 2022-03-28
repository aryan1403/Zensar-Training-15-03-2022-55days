package meow;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Bounds -> int -> 32 bit, String -> 64 bit
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        // bounds -> 32 bit int
        // System.out.println(sum(list));

        List<Double> list2 = new ArrayList<>();
        list2.add(10.0);
        list2.add(20.5);
        list2.add(30.0);
        // bounds -> 32 bit int
        System.out.println(sum2(list2));

        tm.put(1, "Aaryan");
        tm.put(2, "Arush");
        tm.put(3, "Aditya");

        tm.forEach((k, v) -> {
            // System.out.println("Key : " + k + ", Value: " + v);
        });
    }

    public static byte sum(List<? extends Number> list, String type) {
        byte sum = 0;
        for (Number i : list) {
            sum += i.byteValue();
        }

        return sum;
    }

    public static double sum2(List<? extends Number> list) {
        double sum = 0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }
}
