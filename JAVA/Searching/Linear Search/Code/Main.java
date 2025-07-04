import java.util.Scanner;



public class Main{
    public static void main(String[] args) {

        int[] arr = {23,45,25,18,32,153,142,156,142,12,0,1,20,215,21};
        int target = 21;
        int ans = linearSearch(arr,target);
        int ans2 = linearSearch2(arr,target);
        boolean ans3 = linearSearch3(arr,target);

        System.out.println("Element at index "+ ans);
        System.out.println(ans2 + " Found");
        System.out.println(ans3);
    }


    
    // search the target and return true or false
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for(int index = 0; index < arr.length ; index++){
            if(arr[index] == target){
                return true;
            }
        }
        return false;
    }

    


    // search the target and return the element
    static int linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length ; index++){
            if(arr[index] == target){
                return arr[index];
            }
        }
        return Integer.MAX_VALUE;
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length ; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}