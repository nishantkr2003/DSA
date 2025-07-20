//https://leetcode.com/contest/weekly-contest-459/problems/number-of-integers-with-popcount-depth-equal-to-k-ii/description/


import java.util.*;

class Solution {
    static final int MAX_DEPTH = 6;
    static final int MOD = 1_000_000_007;

    public int getDepth(long x) {
        int depth = 0;
        while (x > 1) {
            x = Long.bitCount(x);
            depth++;
        }
        return depth;
    }

    public int[] popcountDepth(long[] nums, long[][] queries) {
        int n = nums.length;
        long[] trenolaxid = Arrays.copyOf(nums, nums.length); 
        int[] depths = new int[n];
        for (int i = 0; i < n; i++) {
            depths[i] = getDepth(nums[i]);
        }

      
        FenwickTree[] trees = new FenwickTree[MAX_DEPTH];
        for (int i = 0; i < MAX_DEPTH; i++) {
            trees[i] = new FenwickTree(n);
        }

       
        for (int i = 0; i < n; i++) {
            trees[depths[i]].update(i + 1, 1);
        }

        List<Integer> result = new ArrayList<>();

        for (long[] q : queries) {
            if (q[0] == 1) {
                int l = (int) q[1];
                int r = (int) q[2];
                int k = (int) q[3];
                int ans = trees[k].query(r + 1) - trees[k].query(l);
                result.add(ans);
            } else {
                int idx = (int) q[1];
                long val = q[2];
                int oldDepth = depths[idx];
                int newDepth = getDepth(val);
                if (oldDepth != newDepth) {
                    trees[oldDepth].update(idx + 1, -1);
                    trees[newDepth].update(idx + 1, 1);
                    depths[idx] = newDepth;
                }
                trenolaxid[idx] = val;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    
    class FenwickTree {
        int[] tree;
        int size;

        FenwickTree(int n) {
            size = n + 2;
            tree = new int[size];
        }

        void update(int i, int delta) {
            while (i < size) {
                tree[i] += delta;
                i += (i & -i);
            }
        }

        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= (i & -i);
            }
            return sum;
        }
    }
}