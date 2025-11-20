import java.util.*;

class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result.add(-1);
            }
            else{
                result.add(s.peek());
            }
            s.push(arr[i]);
        }
        //Collections.reverse(result);
        return result;
        
    }
}