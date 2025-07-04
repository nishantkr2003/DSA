// https://leetcode.com/problems/matrix-diagonal-sum/description/


class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0;i<mat.length;i++){
            int m = mat[i].length;
            for(int j=0;j<m;j++){
                if(i==j){
                    sum = sum + mat[i][j];
                    sum = sum + mat[i][m-i-1];
                }
            }
        }
        if(n%2 == 1){
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }
}