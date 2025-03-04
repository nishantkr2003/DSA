class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // Position to place the next non-zero element
        
        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; // Move j to the next position
            }
        }
      //  return nums;
    }
}