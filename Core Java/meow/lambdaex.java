package meow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface in {
    public void say();
}
class sorting implements Comparator<Integer> {

    @Override
    public int compare(Integer i, Integer j) {
        if(i < j) {
            return -1;
        }
        return 0;
    }

}

public class lambdaex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(2);

        list.sort((a, b) -> {
            if (a < b) {
                return -1;
            }
            return 0;
        });
        in i3 = () -> {
            System.out.println("Hello Aaryan");
        };
    }
}
