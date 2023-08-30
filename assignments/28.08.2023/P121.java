public class P121 {
    public int maxProfit(int[] prices) {
        int purchase = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            profit = Math.max(profit,prices[i]-purchase);
            purchase = Math.min(prices[i],purchase);
        }
        return profit;
    }
}
