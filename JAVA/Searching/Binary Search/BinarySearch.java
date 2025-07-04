public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {-8,25,-6,-45,-254,25,51 ,55,585};
        int target = 25;
        int result = binarySearch(arr, target);
        System.err.println(result);



        // return index
        // return -1 if not in arr

    

    }

     static int binarySearch(int[] arr, int x) {
            int start=0;
            int end =arr.length-1;

            while(start<=end){
                //int mid = (start+end)/2;
                int mid = start + (end - start) / 2;
                if(x< arr[mid]){
                    end = mid-1;
                }
                else if(x>arr[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
}