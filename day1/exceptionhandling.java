public class exceptionhandling {
    
    public static void main(String[] args) throws MyException {
        int result = 2/1;
        System.out.println(result);
        throw new MyException("Divide not allowed");
    }
}
class MyException extends Exception {
    public MyException(String message) {
        super(message); // it calls the contructor from the parent class
    }
}
