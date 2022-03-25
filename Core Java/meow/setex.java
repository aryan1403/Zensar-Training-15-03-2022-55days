package meow;

import java.util.HashSet;
import java.util.Set;

public class setex {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(11);
        set.add(15);
        set.add(10);


        System.out.println(set);
    }
}
