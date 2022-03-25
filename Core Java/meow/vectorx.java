package meow;

import java.util.Vector;

public class vectorx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        // Arrays, earlier

        v.add(10); // 0
        v.add(20); // 1
        v.add(35); // 2

        // Methods are same like List

        System.out.println("Size = " + v.size());
        System.out.println("Removed " + v.remove(2));
        System.out.println(v.elementAt(0));
    }
}
