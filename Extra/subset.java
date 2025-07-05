public class subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;     
        int sum = 10;
        boolean[][] dp = new boolean[n + 1][sum + 1];




        

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    dp[i][j] = true; 
                } else if (i == 0) {
                    dp[i][j] = false; 
                } else {
                    
                    dp[i][j] = dp[i - 1][j];
                    if (arr[i - 1] <= j) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]]; 
                    }
                }
            }
        }
        System.out.println(dp[n][sum]);

    }
}
