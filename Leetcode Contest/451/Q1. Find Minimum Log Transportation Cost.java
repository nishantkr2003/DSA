//  https://leetcode.com/contest/weekly-contest-451/problems/find-minimum-log-transportation-cost/


class Solution {
    public long minCuttingCost(int n, int m, int k) {
    
        if (n <= k && m <= k) return 0;
        long minCost = Long.MAX_VALUE;


        

        // Try cutting n into two parts and check if both parts and m fit
        for (int i = 1; i < n; i++) {
            int len1 = i, len2 = n - i;
            if (len1 <= k && len2 <= k && m <= k) {
                minCost = Math.min(minCost, (long) len1 * len2);
            }
        }

        // Try cutting m into two parts and check if both parts and n fit
        for (int i = 1; i < m; i++) {
            int len1 = i, len2 = m - i;
            if (len1 <= k && len2 <= k && n <= k) {
                minCost = Math.min(minCost, (long) len1 * len2);
            }
        }

        return minCost;
    }
}
