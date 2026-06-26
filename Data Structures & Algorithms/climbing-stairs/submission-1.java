class Solution {

    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        return recursive(n);
    }

    public int recursive(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != 0) return dp[n];

        dp[n] = recursive(n - 1) + recursive(n - 2);

        return dp[n];
    }
}