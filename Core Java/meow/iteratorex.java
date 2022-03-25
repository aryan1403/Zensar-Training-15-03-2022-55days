package meow;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratorex {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(23);
        list.add(32);
        list.add(11);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
