package 双指针;

import java.lang.reflect.Array;
import java.util.Arrays;

public class l16 {
	 public static int threeSumClosest(int[] nums, int target) {
		 Arrays.parallelSort(nums);
		 int result=nums[0]+nums[1]+nums[2];
		 for (int i = 0; i < nums.length-2; i++) {
			int p=i+1;
			int d=nums.length-1;
			while(p!=d) {
				int sum=nums[i]+nums[p]+nums[d];
				if(Math.abs(sum-target)<Math.abs(result-target)) {
					result=sum;
				}
				if(sum>target) {
					d--;
					while(p != d && nums[d] == nums[d+1]) {
						d--;
					}
				}else if(sum<target) {
					p++;
					while(p != d && nums[p] == nums[p+1]) {
						p++;
					}
				}else {
					return sum;
				}
				
			}
			
		}
		 
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-1,2,1,-4};
		int target=1;
		System.out.println(threeSumClosest(nums, target));
	}

}
