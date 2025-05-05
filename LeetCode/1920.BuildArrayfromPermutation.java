//   https://leetcode.com/problems/build-array-from-permutation/description/

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n];


        for(int i=0;i<arr.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}