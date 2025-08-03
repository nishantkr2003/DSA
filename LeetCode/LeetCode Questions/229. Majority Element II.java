//  https://leetcode.com/problems/majority-element-ii/description/


import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > n / 3) {
                result.add(key);
            }
        }

        return result;
    }
}
