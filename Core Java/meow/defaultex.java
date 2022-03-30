package meow;

public interface defaultex {
    public default void meow() {
        System.out.println("Meow Meow");
    }
    public static void m() {
        System.out.println("Meow1");
    }
}
class mid implements defaultex {
}
class cat {
    static defaultex ex = new mid();

    public static void main(String[] args) {
        ex.meow();
        defaultex.m();
    }
}
