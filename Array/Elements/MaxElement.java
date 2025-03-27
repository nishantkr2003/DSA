import java.util.* ;
import java.io.*; 

public class MaxElement {

    static int largestElement(int[] arr, int n) {
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        
    
        int[] arr={2,58,26,12,85,11,36};
        int n=arr.length;
        System.out.println(largestElement(arr,n));

    }
}