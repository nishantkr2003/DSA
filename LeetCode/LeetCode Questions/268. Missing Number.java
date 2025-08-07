//https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int actualSum = 0;

       for(int i=0;i<n;i++){
        
        actualSum = actualSum + nums[i];
       } 
       int d = sum - actualSum;
       return d;
    }
}