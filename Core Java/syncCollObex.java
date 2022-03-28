import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class syncCollObex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(9);
        list.add(0);
        list.add(45);

        Collection<Integer> col = Collections.synchronizedList(list);
        System.out.println("Synchronised View : " + col.toString());
    }
}
