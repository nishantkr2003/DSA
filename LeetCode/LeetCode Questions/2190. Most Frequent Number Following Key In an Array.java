// https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/description/

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                map.put(target, map.getOrDefault(target, 0) + 1);

                if (map.get(target) > maxFreq) {
                    maxFreq = map.get(target);
                    result = target;
                }
            }
        }

        return result;
    }
}
