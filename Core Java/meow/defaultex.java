package meow;

import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public interface defaultex {
    public default void meow() {
        System.out.println("Meow Meow");
    }
    public static void m() {
        System.out.println("Meow1");
    }
}
class mid implements defaultex {
    // convert int -> boolean
    static IntPredicate predicate = (value) -> {
        // Logic
        if(value % 2 == 0) {
            return true;
        }
        return false;
    };

    // func for double -> Generic
    static DoubleFunction<cat> df = new DoubleFunction<>() {

        @Override
        public cat apply(double value) {
            if(value == 0) {
                return null;
            }
            return new cat();
        } 
    };

    public static void main(String[] args) {
        cat c = df.apply(10);
        System.out.println(c.ex);
    }
}
class cat {
    static defaultex ex = new mid();
}
