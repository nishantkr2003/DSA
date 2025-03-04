

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23,45,25,18,32,153,142,156,142,12,0,1,20,215,21};
        int target = 25;
        int ans = search(arr,target,2,6);
        System.out.println("Element at index "+ ans);
        
    }

    static int search(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start ; i<=end ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
