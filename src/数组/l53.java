package 数组;

import java.util.Iterator;

public class l53 {
	/**
	 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
	 * 
	 *  
	 * 
	 * 示例 1：
	 * 
	 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4] 输出：6 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
	 * 
	 * 
	 * @param nums
	 * @return
	 */

	public static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int ans = nums[0];
		int sum = 0;
		for (int num : nums) {
			if (sum > 0) {
				sum += num;
			} else {
				sum = num;
			}
		}
		ans = Math.max(ans, sum);
//		if(nums.length<2) {
//			return nums[0];
//		}
//		for (int i = 0; i < nums.length; i++) {
//			int sum=0;
//			
//			for (int j = i; j < nums.length; j++) {
//				
//				sum+=nums[j];
//				if(sum>max) {
//					max=sum;
//				}
//			}
//			
//		}
//		if(nums[nums.length-1]>max) {
//			max=nums[nums.length-1];
//		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(nums));
	}

}
