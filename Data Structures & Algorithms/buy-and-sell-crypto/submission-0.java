class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minSoFar = prices[0];

        for(int coinIndex = 0; coinIndex < prices.length; coinIndex++){
            //operation on the current index
            ans = Math.max(ans, prices[coinIndex] - minSoFar);
            minSoFar = Math.min(prices[coinIndex], minSoFar);
        }

        return ans;
    }
}
