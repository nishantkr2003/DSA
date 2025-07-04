// Time complexities of selection sort is O(n^2) in all cases (best, average, worst)
// Space complexity is O(1) as it only requires a constant amount of additional space
// Selection sort is not a stable sort, as it may change the relative order of equal elements
// Selection sort is an in-place sorting algorithm, meaning it does not require any additional storage space for sorting the array
// Selection sort is not a comparison-based sorting algorithm, as it does not compare elements directly to determine their order
// Selection sort is a simple sorting algorithm that divides the input array into two parts: sorted and unsorted



import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1,0,85,-12};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }


    // This function returns the index of the maximum element in the array between start and end indices
    private static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr ,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
