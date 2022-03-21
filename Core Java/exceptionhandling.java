public class exceptionhandling {
    public static void main(String[] args) {
        // Handling the exceptions
        try {
            int result = 2 / 0;
        } catch(Exception e) {
            System.out.println("Exception Occured!");
        }
            // throw new Exception("Cannot divide by zero");
            // System.out.println(result);
        
    }

    class MyException extends Exception {
    }
}
