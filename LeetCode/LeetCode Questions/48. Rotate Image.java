//  https://leetcode.com/problems/rotate-image/description/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        //Reverse the array
        for(int i=0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
    }
}