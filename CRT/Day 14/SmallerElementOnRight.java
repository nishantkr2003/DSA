import java.util.*;

public class SmallerElementOnRight {

    public static int[] findSmallerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 3, 9, 6};
        int[] result = findSmallerElement(arr);

        System.out.println("Smaller elements on right for each element:");
        System.out.println(Arrays.toString(result));
    }
}
