//  https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Find the min in each row
        for (int i = 0; i < rows; i++) {
            int minVal = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if minVal is the max in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                result.add(minVal);
            }
        }

        return result;
    }
}
