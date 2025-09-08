// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

import java.util.*;
class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (q.isEmpty() || k <= 0 || k > q.size()) {
            return q;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
        return q;
        
        
        
    }
}