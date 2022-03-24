public class sorting {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 5, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
