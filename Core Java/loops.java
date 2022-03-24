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

        // for each loop
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // no Indexing..., easy, minimal
        // faster than for i loop
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
