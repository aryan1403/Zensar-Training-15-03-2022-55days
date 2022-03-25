package meow;

import java.util.ArrayList;
import java.util.List;

public class StackOwnImpl {
    List<Integer> list = new ArrayList<>();

    public int push(int a) {
        list.add(a);
        return a;
    }
    public int poll() {
        // Last Element
        // Size - 1
        return list.remove(list.size() - 1);
    }
    public boolean isEmpty() {
        if(list.size() == 0) {
            return true;
        }
        return false;
    }
    public void add(int element, int index) {
        list.add(index, element);
    }
    @Override
    public String toString() {
        return "StackOwnImpl " + list;
    }
}
