public class arraysex {
    public static void main(String[] args) {
        try{
            int arr[] = new int[10]; // 0 - 9
    
            System.out.println(arr.length);
    
            arr[0] = 11;
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            
            System.out.println(arr[15]); // not available in the memory
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("This index doesn't exist");
        }
    }
}
