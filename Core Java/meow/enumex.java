package meow;

public class enumex {
    enum Level {
        low,
        medium,
        high
    }
    public static void main(String[] args) {
        Level l = Level.high;

        Level[] v = Level.values();

        for (Level level : v) {
            System.out.println(level);
        }

        switch (l) {
            case low:
                System.out.println("Low Level");
                break;
            case medium:
                System.out.println("Medium Level");
                break;
            case high:
                System.out.println("High Level");
                break;
            default:
                break;
        }
    }
}
