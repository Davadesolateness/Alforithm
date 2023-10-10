package test;

/**
 * @author dongzhibo
 * @version 1.0
 * @description: 动态规划
 * @date 2023/6/14 17:17
 */
public class DynamicProgramming {

    /**
     * 动态规划，循环得出最优解
     * @param n
     * @return 最优解
     * @author dongzhibo
     * @date 2023/6/14 17:27
     */
    public static int function1(int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int res = Integer.MAX_VALUE - 1;
            if (i >= 2) {
                res = Math.min(dp[i - 2] + 1, res);
            }
            if (i >= 5) {
                res = Math.min(dp[i - 5] + 1, res);
            }
            if (i >= 7) {
                res = Math.min(dp[i - 7] + 1, res);
            }
            dp[i] = res;
        }
        return dp[n];
    }
}
