package org.example.ArrayOrString;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println("max Profit: "+maxProfit);
    }
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1; i<prices.length;i++){
            if(prices[i]<buy)
                buy=prices[i];
            else if(prices[i]-buy>profit)
                profit=prices[i]-buy;
        }
        return profit;
    }
}
