package meow;

import java.util.ArrayList;
import java.util.List;

public class mrex {
    static int logic(int a, int b) {
        return (a + b);
    }
    static void add(int a, int b) {
        System.out.println("Sum = " + logic(a, b));
    }
    public static void main(String[] args) {
        // Method Referencing
        add(10, 15);

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(0);
        list.add(17);

        list.forEach(System.out::println); // Enhanced println
    }
}
