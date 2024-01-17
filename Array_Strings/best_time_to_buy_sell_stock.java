class Solution {
    public int maxProfit(int[] prices) {
        int currentCheap = prices[0];
        int currentMax = 0;
        for(int i=1;i<prices.length;i++){
            currentMax = Math.max(currentMax, prices[i] - currentCheap);
            if(prices[i]<currentCheap){
                currentCheap = prices[i];
            }
        }
        return currentMax;
    }
}