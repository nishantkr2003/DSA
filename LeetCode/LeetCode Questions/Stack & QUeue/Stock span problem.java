import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();   
        for(int i=0;i<arr.length;i++){       
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span;
            if(s.isEmpty()){
                span = i+1;
            }
            else{
                span = i - s.peek();
            }
            list.add(span);
            s.push(i);
        }
        return list;
        
    }
}