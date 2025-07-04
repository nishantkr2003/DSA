
// Time complexities: O(n^2) in worst case and average case, O(n) in best case
// Space complexity: O(1) as it is an in-place sorting algorithm
// Stable sorting algorithm: Yes
// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.


public class bubbleSort {
    public static void main(String[] args){
        int arr[] = {64, 34, -25, 12, 22, 11, 90};
        bubble(arr);
        System.out.println("Sorted array: ");
        printArr(arr);
    }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
