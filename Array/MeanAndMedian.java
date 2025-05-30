import java.util.*;
public class MeanAndMedian {

    public static double findMean(int a[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        return (double)sum/(double)n;
    }

    public static double findMedian(int a[],int n){
        // First we sort the array
        Arrays.sort(a);
        if(n%2!=0)
        {
            return (double)a[n/2];
        }
        else
        {
            return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
        int n= a.length;
        System.out.println("Mean="+findMean(a,n));
        System.out.println("Median="+findMedian(a,n));

    }
}
