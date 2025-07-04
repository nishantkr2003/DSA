public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {5,21,25,36,44,56,478,895,4563};
        int target = 56;
        System.out.println(ans(arr,target));        
    }

    static int ans(int[] arr ,int target){


        int start=0;
        int end = 1;

        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end -start + 1)*2;
            start = temp;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target ,int start,int end){
        int mid = start + (end - start) / 2;
        while(start<=end){
       if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    
}
