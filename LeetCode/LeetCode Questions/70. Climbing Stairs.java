// https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int a = 1; // ways to reach step 1
        int b = 2; // ways to reach step 2
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b; // next term = sum of previous two
            a = b;
            b = c;
        }
        return b;
    }
}
