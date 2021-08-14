package 动态规划;

public class l322 {
	public int coinChange(int[] coins, int amount) {
        // 自底向上的动态规划
        if(coins.length == 0){
            return -1;
        }

        // memo[n]的值： 表示的凑成总金额为n所需的最少的硬币个数
        int[] memo = new int[amount+1];
        memo[0] = 0;
        //凑成总金额的次数
        for(int i = 1; i <= amount;i++){
            int min = Integer.MAX_VALUE;
            //硬币数组长度为3 所以j循环三次(最少需要三次才能凑够硬币数)
            for(int j = 0;j < coins.length;j++){
            	//当前面额必须大于要选的数额 并且
                if(i - coins[j] >= 0 && memo[i-coins[j]] < min){
                    //凑齐当前面额的
                	min = memo[i-coins[j]] + 1;
                }
            }
            // memo[i] = (min == Integer.MAX_VALUE ? Integer.MAX_VALUE : min);
            memo[i] = min;
        }

        return memo[amount] == Integer.MAX_VALUE ? -1 : memo[amount];

    }
	public static void main(String[] args) {
		l322 l=new l322();
		int coins[]= {1,2,5};
		
		int amount=11;
		System.out.println(l.coinChange(coins, amount));
	}
}
