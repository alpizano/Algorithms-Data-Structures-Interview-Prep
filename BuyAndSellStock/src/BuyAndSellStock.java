
public class BuyAndSellStock {
	 public int maxProfit(int[] prices) {
		 
		 int profit = 0;
		 int buy = 0;
		 int sell = 0;
		 int max_profit = 0;
		 
		 for(int i=0; i<=prices.length-1; i++) {
			 buy = prices[i];
			 for(int j=i+1; j<=prices.length-1; j++) {
				 sell =  prices[j];
				 profit = sell - buy;
				 if(profit > max_profit) {
					 max_profit = profit;
				 }				 
			 }
		 }
		 return max_profit;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] {7,1,5,3,6,4};
		int[] input2 = new int[] {7,6,4,3,1};
		
		BuyAndSellStock test = new BuyAndSellStock();
		
		System.out.println(test.maxProfit(input));
		System.out.println(test.maxProfit(input2));
	}

}
