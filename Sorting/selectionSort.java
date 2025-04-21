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
