package 动态规划;

public class l121 {
	
	 public static int maxProfit(int[] prices) {

		        int len = prices.length;
		        if (len < 2) {
		            return 0;
		        }

		        int[] dp = new int[2];
		        dp[0] = 0;
		        dp[1] = -prices[0];
		        for (int i = 1; i < len; i++) {
		            dp[0] = Math.max(dp[0], dp[1] + prices[i]);
		            dp[1] = Math.max(dp[1], -prices[i]);
		        }
		        return dp[0];
		    }


	    
	
	public static void main(String[] args) {
		
		int [] prices= {1,2};
		System.out.println(maxProfit(prices));
	}

}