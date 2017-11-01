package java.solution;

public class LC122_Best_Time_Stock_II {
	public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}
