import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class fffs {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        map.put(1, 10);
        map.put(2, 20);
        map.put(4, 3);

        Iterator<Integer> it = map.keySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            map.put(5, 20);
        }
    }
}
