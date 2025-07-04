// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/


class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Found target
            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates: move pointers to skip them
            if (nums[low] == nums[mid] && nums[high] == nums[mid]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (nums[mid] >= nums[low]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // Search left
                } else {
                    low = mid + 1;   // Search right
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;   // Search right
                } else {
                    high = mid - 1;  // Search left
                }
            }
        }
        return false;
    }
}