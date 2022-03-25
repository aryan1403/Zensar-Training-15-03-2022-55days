package meow;

import java.util.HashSet;

public class hashsetex {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(100);
        hs.add(91);

        hs.forEach(e -> {
            System.out.println(e);
        });

        System.out.println(hs);
    }
}
