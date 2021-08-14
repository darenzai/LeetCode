package 贪心;

import java.util.Arrays;

public class 峰与谷 {
    public  void wiggleSort(int[] nums) {
    	int [] ss=new int[2];
    	Arrays.parallelSort(nums);
    	int n=nums.length;
    	int[] arr = new int[n];
    	int l=0;
    	int r=n-1;
    	int idx=0;
    	while(l<r) {
    		arr[l++]=nums[l++];
    		arr[r--]=nums[r--];
    	}
    	if (n % 2 == 1) arr[idx] = nums[l];
    	System.arraycopy(arr, 0, nums, 0, n);
    
    }
    
    public static void main(String[] args) {
    	峰与谷 l=new 峰与谷();
    	int [] nums= {2,7,11,15};
    	l.wiggleSort(nums);
    	
	}
}
