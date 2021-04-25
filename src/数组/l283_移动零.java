package 数组;

import java.util.Arrays;



public class l283_移动零 {
	public void moveZeroes(int[] nums) {
		if(nums==null) {
			return ;
		}
		int j=0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]!=0) {
				nums[j++]=nums[i];
			}
		}
		for(int i=j;i<nums.length;++i) {
			nums[i]=0;
		}
    }
	public static void main(String[] args) {
		int[] arr= {1,2,33,3};
		
		
	}
}
