public class switchcase {
    public static void main(String[] args) {
        int a = -10;

        switch (a) {
            case 10:
                System.out.println("a is positive");
                break;
            case -10:
                System.out.println("a is negative");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
