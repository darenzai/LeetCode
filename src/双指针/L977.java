package 双指针;

import java.util.Arrays;

public class L977 {
	 public static  int[] sortedSquares(int[] nums) {
		 
		 for (int i = 0; i < nums.length; i++) {
			nums[i]=Math.abs(nums[i])*Math.abs(nums[i]);
			
		}
		 Arrays.parallelSort(nums);
		 return nums;
		 	
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-4,-1,0,3,10};
		
		System.out.println(sortedSquares(nums));
		
	}

}
