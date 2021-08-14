package 二分法;

public class l153 {
	public int findMin(int[] nums) {
		
		int l=0;
		int r=nums.length;
		while(l<r) {
			int mid=l+(r-l)/2;
			if(nums[mid]<nums[r]) {
				l=mid;
			}else {
				l=mid+1;
			}
		}
		return nums[l];
		
	}
	public static void main(String[] args) {
		
	}
}
