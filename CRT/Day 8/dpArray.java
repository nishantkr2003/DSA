

public class dpArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[][] dp = new int[n][n];

        // Initialize the dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1; // or any other default value
            }
        }

        
        dp[0][0] = arr[0];
        System.out.println("Value at dp[0][0]: " + dp[0][0]);
    }
}
