public class maxProfit0 {

	public static int maxProfit(int[] prices) {
		int len = prices.length;
		if (len <= 1) return 0;
		int minPrice = prices[0];
		int max = 0;
		for (int i = 1; i < len; i++) {
			if (prices[i] > minPrice) {
				if (prices[i] - minPrice > max)
					max = prices[i] - minPrice;
			}
			else minPrice = prices[i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[] prices = {6, 1, 3, 2, 4, 7};
		System.out.println(maxProfit(prices));
	}
}