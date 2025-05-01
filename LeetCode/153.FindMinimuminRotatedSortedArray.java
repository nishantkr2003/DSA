//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/


class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost, min must be in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, min is in left half including mid
                right = mid;
            }
        }

        return nums[left];
    }
}
