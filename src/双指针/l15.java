package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		Arrays.parallelSort(nums);
		int l=nums.length;
		for (int i = 0; i < l; ++i) {
			if(nums[i]>0) {
				return lists;
			}
			if(i>0 && nums[i]==nums[i-1]) continue;
			
			int curr=nums[i];
			int p=i+1;
			int d=l-1;
			while(p<d){
				int tmp=curr+nums[p]+nums[d];
				if(tmp==0) {
					List<Integer> list=new ArrayList<Integer>();
					list.add(curr);
					list.add(nums[p]);
					list.add(nums[d]);
					lists.add(list);
					while(p<d&&nums[p+1]==nums[p]) ++p;
					while(p<d&&nums[d]==nums[d-1]) --d;
					++p;
					--d;
				}else if(tmp<0) {
					++p;
				}else {
					--d;
				}
			}
		}
		
		
		
		return lists;
	}
	
	public static void main(String[] args) {
		int [] nums= {-1,0,1,2,-1,-4};
		
	}
}
