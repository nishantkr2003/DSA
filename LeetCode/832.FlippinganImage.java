// https://leetcode.com/problems/flipping-an-image/description/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            int m = image[i].length;
            for(int j=0;j<m;j++){

                // Invert: XOR with 1
                arr[i][j] = image[i][m-j-1]^1;
                

            }    
        }
        
        
        return arr;
    }
}