package meow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class nstreamex {
    public static void fibonacci(int n) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        // 0 1 1 2 3 5 8

        // 1st iteration (i = 1)
        // 1 + 0 = 1
        // curr + pre = next
        // next -> list

        for (int i = 1; i <= n; i++) {
            int curr = list.get(i);
            int pre = list.get(i - 1);
            int next = curr + pre;
            list.add(next);
        }
        list.forEach(e -> System.out.println(e));
    }
    public static void factorial(int n) {
        int result = 1;
        int m = n;
        while(n > 0) {
            result *= n;
            n--;
        }
        System.out.println("Factorial of " + m + " is : " + result);
    }
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(19);
        coll.add(23);
        coll.add(42);
        coll.add(46);

        List<Integer> list = new ArrayList<>();
        list.addAll(coll);
        list.add(35);
        Stream<Integer> st = list.stream();

        List<Integer> l = st.filter(e -> (e % 2 == 0)).collect(Collectors.toList());
        // l.forEach(System.out::println);
        l.clear();
        l.add(5); // 5
        // Stream<Integer> ps = l.stream().parallel();
        Stream<Integer> s = l.stream();
        // s.forEach(new ccon()); // Factorial
        s.forEach(new ccon1()); // fibonacci


        // fibonacci(10);
        // factorial(5);
    }

}
class ccon implements Consumer<Integer> {
    int res = 1;

    @Override
    public void accept(Integer t) {
        while(t > 0) {
            res *= t;
            t--;
        }
        System.out.println(res);
    }

}

class ccon1 implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        // 0 1 1 2 3 5 8

        // 1st iteration (i = 1)
        // 1 + 0 = 1
        // curr + pre = next
        // next -> list

        for (int i = 1; i <= t; i++) {
            int curr = list.get(i);
            int pre = list.get(i - 1);
            int next = curr + pre;
            list.add(next);
        }
        list.forEach(e -> System.out.println(e));
    }

}
