// Insertion Sort in Java
// Time Complexity: O(n^2) in worst case, O(n) in best case
// Space Complexity: O(1) as it only requires a constant amount of additional space
// Stable: Yes, as it maintains the relative order of equal elements
// In-place: Yes, as it does not require any additional storage space for sorting the array
// Comparison-based: Yes, as it compares elements to determine their order
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,85,-12};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static void insertion(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int temp = arr[i];
    //         int j = i-1;
    //         while(j>=0 && arr[j]>temp){
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = temp;
    //     }

    // }

    public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        for (int j = i; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                // Swap
                swap(arr, j, j - 1);
            } else {
                break;
            }
        }
    }
}


    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    
}
