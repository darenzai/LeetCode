package 数组;

import java.util.Arrays;

public class l287 {
	
    public static int findDuplicate(int[] nums) {
    	
    	int w []=new int[nums.length+1];
    	
    	for (int i = 0; i < nums.length; i++) {
			if(w[nums[i]]==1) {
				return nums[i];
			}
			
			w[nums[i]]++;
		}

//    	Arrays.parallelSort(nums);
//    	for (int i = 0; i < nums.length-1; i++) {
//			if(nums[i]==nums[i+1]) {
//				return nums[i];
//			}
//		}
    	
    	
//    	for (int i = 0; i < nums.length; i++) {
//    		int k=nums[i];
//    		int flag=0;
//			for (int j = 0; j < nums.length; j++) {
//				if(k==nums[j]) {
//					++flag;
//					if(flag>=2) {
//						return k;
//					}
//				}
//			}
//		}
    	
    	return 0;

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,3,4,2,2};
		System.out.println(l287.findDuplicate(nums));

	}

}
