public class loops {
    public static void main(String[] args) {
        // 0 -> 1 -> 2 -> 3 ... 9

        for (int i = 0; i < 10; i++) {
            System.out.println("Meow meow");
        }
        int i = 0;
        while (i < 10) {
            System.out.println("Meow meow");
            i++;
        }

        do {
            System.out.println("hello");
            i++;
        } while(i < 20);
    }
}
