class Solution {
    int[] dp;
    public int tribonacci(int n) {
        dp=new int[n+1];
        return recursive(n);
    }
    public int recursive(int n){
     if(n==0) return 0;
     else if(n==1||n==2) return 1;
     if(dp[n]!=0) return dp[n];
    dp[n]=recursive(n-1)+recursive(n-2)+recursive(n-3);
     return dp[n];
    }
}