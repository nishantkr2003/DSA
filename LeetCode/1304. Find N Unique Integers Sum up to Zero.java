// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Add pairs like (-i, i)
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = -i;
            result[index++] = i;
        }

        // If n is odd, add 0
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}
