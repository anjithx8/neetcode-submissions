class Solution {
    public int maxProfit(int[] prices) {
        int left =0,right=1,max=0;
        while (right < prices.length){
            if(prices[right]<prices[left]){
                left=right;
                right=right+1;
                continue;
            }
            int profit=prices[right]-prices[left];
            max=Math.max(max,profit);
            right++;
        }
        return max;
    }
}
