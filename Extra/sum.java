  sum of arr using recursion
public class sum {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr, arr.length);
        System.out.println("Sum of array elements: " + sum);
    }
    public static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return arr[n - 1] + sumArray(arr, n - 1);
        }
    }
}
