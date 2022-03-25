package meow;

import java.util.LinkedHashSet;

public class linkedhassetex {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(1);
        lhs.add(-90);
        lhs.add(24);

        lhs.forEach(System.out::println);

        System.out.println(lhs);
    }
}
