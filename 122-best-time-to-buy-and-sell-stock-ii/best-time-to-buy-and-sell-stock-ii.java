class Solution {
    public int maxProfit(int[] prices) {
        int minBut=prices[0],maxSell=0,maxProfit=0,currProfit=0;
        for(int i=1;i<prices.length;i++){
            currProfit = prices[i]-prices[i-1];
            if(currProfit>0){
                maxProfit += currProfit;
            }
        }
        return maxProfit;
    }
}