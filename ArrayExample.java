public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5];  // Declare an array of size 5
        
        // Insert elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        // Access elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
// integer1= Integer.ParseInt(arr[0]);