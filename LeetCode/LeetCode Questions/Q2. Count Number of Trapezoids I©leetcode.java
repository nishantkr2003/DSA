// https://leetcode.com/contest/weekly-contest-459/problems/count-number-of-trapezoids-i/description/

import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int countTrapezoids(int[][] points) {
        
        Map<Integer, List<Integer>> yToXs = new HashMap<>();

        for (int[] point : points) {
            int x = point[0], y = point[1];
            yToXs.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        
        List<Long> pairCounts = new ArrayList<>();
        for (List<Integer> xs : yToXs.values()) {
            int n = xs.size();
            if (n >= 2) {
                long pairs = (long) n * (n - 1) / 2;
                pairCounts.add(pairs);
            }
        }

        
        long total = 0, prefixSum = 0;
        for (long count : pairCounts) {
            total = (total + prefixSum * count % MOD) % MOD;
            prefixSum = (prefixSum + count) % MOD;
        }

        return (int) total;
    }
}
