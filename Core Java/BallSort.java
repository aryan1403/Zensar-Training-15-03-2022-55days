import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BallSort implements Comparator<Ball> {
    public void sort() {
        Ball b1 = new Ball("white", 180, "Rubber", "Football");
        Ball b2 = new Ball("red", 80, "Rubber", "Cricket");

        List<Ball> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);

        list.sort(this);

        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        new BallSort().sort();
    }

    @Override
    public int compare(Ball a, Ball b) {
        if(a.size < b.size) {
            return -1; // Swap
        }
        return 0; // Don't Swap
    }
}
