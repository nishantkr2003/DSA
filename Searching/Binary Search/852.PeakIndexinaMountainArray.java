
// https://leetcode.com/problems/peak-index-in-a-mountain-array/



public class 852 PeakIndexinaMountainArray {

    int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start )/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec par tof an array
                end = mid;
            }
            else{
                // you ar ein dec part of an array
                start = mid + 1;
            }
        }
        return start;
    
}
