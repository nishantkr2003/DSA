// https://leetcode.com/problems/next-greater-element-ii/description/

import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result,-1);
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<2*n;i++){
            int currIndex = i%n;
            while(!s.isEmpty() && nums[currIndex] > nums[s.peek()]){
                int index = s.pop();
                result[index] = nums[currIndex];
            }

            if (i < n) {
                s.push(currIndex);
            }
        }
        return result;
    }
}