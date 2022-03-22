public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int result = 2/1;
            System.out.println(result);
        } catch(ArithmeticException a) {
            System.out.println("Cannot divide by 0");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        }
    }
}
