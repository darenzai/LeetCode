package 动态规划;

public class l1049 {
	public int lastStoneWeught(int [] stones) {
		int n = stones.length;
        int sum = 0;
        for(int num:stones){
            sum += num;
        }
        //背包容量上限为石头总重量的一半
        int dp[][] = new int[n+1][sum/2+1];
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum/2;j++){
                //当我能把这块石头放进背包时，我会比较放或不放，选择最大值
                if(j>=stones[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-stones[i-1]] + stones[i-1]);
                } else {
                //这块石头放不进背包时，只能跳过
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        //dp[n][sum/2]的最大值为sum/2，因此最理想的结果为0
        return sum-dp[n][sum/2]*2;

	}
	
	public static void main(String[] args) {
		l1049 l=new l1049();
		int [] stones= {2,7,4,1,8,1};
		System.out.println(l.lastStoneWeught(stones));
	}
}
