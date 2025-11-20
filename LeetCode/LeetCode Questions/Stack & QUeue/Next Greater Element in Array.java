import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>(arr.length);
        Stack<Integer> s = new Stack<>();

        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                result.add(-1);
            } else {
                result.add(s.peek());
            }
            s.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}
