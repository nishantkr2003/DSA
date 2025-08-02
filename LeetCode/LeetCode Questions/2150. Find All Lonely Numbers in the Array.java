// https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/

import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums); 

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isLonely = true;

            if (i > 0 && (nums[i] == nums[i - 1] || nums[i] - 1 == nums[i - 1])) {
                isLonely = false;
            }
            if (i < n - 1 && (nums[i] == nums[i + 1] || nums[i] + 1 == nums[i + 1])) {
                isLonely = false;
            }
            if (isLonely) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
