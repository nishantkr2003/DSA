// https://leetcode.com/problems/find-missing-and-repeated-values/description/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;

        int[] freq = new int[size + 1]; 
        int repeated = -1;
        int missing  = -1;

        // Count frequency of each number
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        // Find missing and repeated
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] == 2) {
                repeated = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
