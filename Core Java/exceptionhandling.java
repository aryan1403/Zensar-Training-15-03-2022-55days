public class exceptionhandling {
    public static void main(String[] args) throws MyException {
      
            int result = 2 / 0;
            // throw new Exception("Cannot divide by zero");
            // System.out.println(result);
        
    }

    class MyException extends Exception {
    }
}
