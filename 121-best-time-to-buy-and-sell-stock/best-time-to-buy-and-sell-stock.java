class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxSell = 0;
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            minBuy = Math.min(prices[i],minBuy);
            if(prices[i]-minBuy > maxProfit){
                maxProfit = prices[i]-minBuy;
            }
        }
        return maxProfit;
    }
}