package meow;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

class c implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}
public class listex {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(10); // 0
        list.add(20); // 1
        list.add(31); // 2
        list.remove(2);

        System.out.println(list.size()); // length of the list
        System.out.println(list.get(0));
        System.out.println(list.contains(21));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(10));
        list.set(1, 80); // replaces
        list.add(1, 100); // push to the right

        list.forEach(new c());

        // [10, 100, 80]
        System.out.println(list.subList(0, 2));
        // 1st way
        for (int i : list) {
            System.out.println(i);
        }
        // 2nd way
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }
}
