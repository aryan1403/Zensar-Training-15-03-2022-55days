package meow;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueex {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(24);
        q.offer(35);

        q.poll();

        System.out.println(q.peek());

        q.forEach(System.out::println);
    }
}
