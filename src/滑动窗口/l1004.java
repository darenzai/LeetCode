package 滑动窗口;

public class l1004 {
	
	public static int longestOnes(int[] nums, int k) {
		int n=k;
		int max=Integer.MIN_VALUE;
		int p=0,d=0,i=0;
		int l=nums.length;
		while(d<l) {
			if(nums[d]==0) {
				i++;
				//n--;
			}
			while(i>n) {
				if(nums[p++]==0)
					i--;
			}
			
			max=Math.max(max, d-p+1);
			d++;
			
		}
		
		
		return max;
    }
	
	
	public static void main(String[] args) {
		int[] nums= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		System.out.println(longestOnes(nums, k));
		
	}

}
