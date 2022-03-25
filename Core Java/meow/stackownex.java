package meow;

public class stackownex {
    public static void main(String[] args) {
        StackOwnImpl stack = new StackOwnImpl();

        stack.push(10);
        stack.push(15);
        stack.push(17);

        stack.poll();
        stack.add(20, 2);

        System.out.println(stack);
    }
}
