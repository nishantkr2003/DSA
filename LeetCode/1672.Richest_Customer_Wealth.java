// https://leetcode.com/problems/richest-customer-wealth/

// 1672. Richest Customer Wealth




class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}