package 滑动窗口;

public class l209 {
	
	public static int minSubArrayLen(int target, int[] nums) {
		int sum=0;
		int p=0;
		int d=0;
		int l=nums.length;
		if(l<=0) {
			return 0;
		}
		int min=Integer.MAX_VALUE;
		while(d<l) {
			sum+=nums[d];
			while(sum>=target) {
				min=Math.min(min,d-p+1);
				sum-=nums[p];
				p++;
			}
			d++;	
		}
				
		return min==Integer.MAX_VALUE?0:min;
    }
	
	
	public static void main(String[] args) {
		int nums[] = {2,3,1,2,4,3};
		
		System.out.println(minSubArrayLen(7, nums));
	}

}	
