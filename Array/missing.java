import java.util.Scanner;

public class missing {
    public static int findMissingSum(int[] arr, int n) {
    int expectedSum = (n * (n + 1)) / 2;
    int actualSum = 0;
    for (int num : arr) {
        actualSum += num; 
    }
    return expectedSum - actualSum;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    int n = arr.length + 1; 
    int missingNumber = findMissingSum(arr, n);
    System.out.println("Missing number is: " + missingNumber);
}
}
