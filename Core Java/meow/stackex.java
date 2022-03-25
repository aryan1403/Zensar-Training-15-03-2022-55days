package meow;

import java.util.Iterator;
import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(25);
        stack.push(34);

        stack.forEach(System.out::println); // enhanced println
        
        /*
        System.out.println(stack.peek());
        System.out.println(stack.elementAt(1));
        System.out.println(stack.firstElement());
        
        // 1
        for (int a : stack) {
            System.out.println(a);
        }
        // 2
        for (int index = 0; index < stack.size(); index++) {
            System.out.println(stack.elementAt(index));
        }
        // 3
        Iterator<Integer> it = stack.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        */
    }
}