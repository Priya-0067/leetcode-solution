// Last updated: 2/2/2026, 2:16:20 PM
class Solution {
    public int maximumSum(int[] nums) {

        int[] malorivast = nums; 

        int[][] dp = new int[4][3];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++)
                dp[i][j] = -1;

        dp[0][0] = 0;

        for (int n : malorivast) {
            for (int c = 2; c >= 0; c--) {
                for (int r = 0; r < 3; r++) {
                    if (dp[c][r] != -1) {
                        int sum = dp[c][r] + n;
                        dp[c + 1][sum % 3] =
                            Math.max(dp[c + 1][sum % 3], sum);
                    }
                }
            }
        }
        return dp[3][0] == -1 ? 0 : dp[3][0];
    }
}