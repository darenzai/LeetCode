package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l15 {
	
	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> lists=new ArrayList<>();
		Arrays.parallelSort(nums);
		
		int len =nums.length;
		for (int i = 0; i < len; ++i) {
			if(nums[i]>0) return lists;
			
			if(i>0&&nums[i]==nums[i-1]) continue;
			int curr=nums[i];
			int L=i+1;
			int R=len-1;
			while(L<R) {
				int tmp=curr+nums[L]+nums[R];
				if(tmp==0) {
					List<Integer> list=new ArrayList<>();
					list.add(curr);
					list.add(nums[L]);
					list.add(nums[R]);
					lists.add(list);
					while(L<R &&  nums[L+1]==nums[L]) ++L;
					while(L<R &&  nums[R-1]==nums[R]) --R;
					++R;
					--L;
				}else if(tmp<0){
					++L;
				}else {
					--R;
				}
			}
		}
		return lists;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(l15.threeSum(nums));
		
	}
}
