package org.example.ArrayOrString;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
        int maxProfit2 = bestTimeToBuyAndSellStockII.maxProfit(new int[]{7,6,4,3,1});
        System.out.println("max profit 2 :"+maxProfit2);
    }
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;

        for(int i=1; i<prices.length;i++){
            if(prices[i]>buy)
                profit+=prices[i]-buy;
            buy=prices[i];
        }
        return profit;

    }
}
