//  https://leetcode.com/problems/create-target-array-in-the-given-order/description/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]); // Insert nums[i] at index[i]
        }
        
        // Convert list to array
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}