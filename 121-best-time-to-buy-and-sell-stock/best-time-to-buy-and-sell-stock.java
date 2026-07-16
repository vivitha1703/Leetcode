class Solution {
    public int maxProfit(int[] prices) {
        int minStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            minStock = prices[i] < minStock ? prices[i] : minStock;
            maxProfit = prices[i]-minStock > maxProfit ? prices[i]-minStock : maxProfit;
        }
        return maxProfit;
    }
}