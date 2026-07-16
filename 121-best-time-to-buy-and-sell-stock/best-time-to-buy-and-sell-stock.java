class Solution {
    public int maxProfit(int[] prices) {
        int minStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minStock){
                minStock = prices[i];
            }
            if(prices[i] - minStock > maxProfit){
                maxProfit = prices[i] - minStock;
            }
            //System.out.println(minStock + " " +maxProfit);
        }
        return maxProfit;
    }
}