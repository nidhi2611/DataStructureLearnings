//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
      int profit = 0;
      int max = 0;
      for(int i = prices.length-1;i>=0; i--){
        if (prices[i] > max ){
            max = prices[i];
        }
        else{
            profit = Math.max(max-prices[i],profit);
        }
      }
      return profit;  
    }
}
