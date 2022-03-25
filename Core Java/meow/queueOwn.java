package meow;

import java.util.ArrayList;
import java.util.List;

public class queueOwn {
    List<Integer> list = new ArrayList<>();

    public int offer(int element) {
        list.add(element);
        return element;
    }

    public int poll() {
        return list.remove(0);
    }

    @Override
    public String toString() {
        return "queueOwn " + list;
    }

    
}
