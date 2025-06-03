//   https://leetcode.com/problems/kth-largest-element-in-an-array/description/?envType=problem-list-v2&envId=sorting


public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}