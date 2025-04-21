package Sorting;
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,85,-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }

    // public static void insertionSort(int[] arr) {
    //     for(int i=1;i<arr.length;i++){
    //         int curr = arr[i];
    //         int prev = i-1;

    //         //finding out the correct pos to insert
    //         while(prev>=0 && arr[prev]>curr){
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         //inserting the element at the correct position

    //         arr[prev+1] = arr[curr];
    //     }
    // }
    
}
