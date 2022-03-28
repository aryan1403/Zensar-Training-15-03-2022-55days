package meow;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(12);
        ts.add(14);
        ts.add(-25);


        ts.forEach(System.out::println);
    }
}
