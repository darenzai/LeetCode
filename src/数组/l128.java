package 数组;

import java.util.HashSet;

public class l128 {
	
	 public int longestConsecutive(int[] nums) {
		 
		 int n=nums.length;
		 if(n==0) {
			 return n;
		 }
		 HashSet<Integer> set=new HashSet<>();
		 for (int i = 0; i < n; i++) {
			set.add(nums[i]);
		}
		 int maxLength=Integer.MIN_VALUE;
		 for (int a:set) {
			if(set.contains(a-1)) {
				continue;
			}else {
				int len=0;
				while (set.contains(a++)) {
					len++;
					
				}
				maxLength=Math.max(len, maxLength);
				
			}
			
		}
		 return maxLength;
	 }
	 
	
	
	public static void main(String[] args) {
		l128 l=new l128();
		int [] nums= {100,4,200,1,3,2};
		System.out.println(l.longestConsecutive(nums));
	}
}
