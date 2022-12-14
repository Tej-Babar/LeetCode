/*121. Best Time to Buy and Sell Stock */
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

public class MaxProfit_19 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minprice=prices[0];
	  int maxProfit=0;
	 
	 for(int i=1;i<prices.length;i++)
	 {
	  minprice = Math.min(prices[i],minprice);
  
	  if(prices[i]-minprice > 0 && prices[i] - minprice > maxProfit)
	      maxProfit = prices[i]-minprice;
	 }
	 return maxProfit;   
    }
}