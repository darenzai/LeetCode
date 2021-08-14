package 数组;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    	
    	int max=Integer.MAX_VALUE;
    	   
    	int [] arr=new int [nums1.length];
    	
    	
//    	for (int i = 0; i < nums1.length; i++) {
//			for (int j = 0; j < nums2.length; j++) {
//				if(nums1[i]==nums2[j]) {
//					arr[i]=nums2[j];
//					nums2[j]=max;
//					break;
//				}
//			}
//		}
    	 List<Integer> result = new ArrayList<>();
    	int r1=0;
    	int r2=0;
    	Arrays.parallelSort(nums1);
    	Arrays.parallelSort(nums2);
    	while(r1<nums1.length&&r2<nums2.length) {
    		if(nums1[r1]>nums2[r2]) {
    			r2++;
    		}
    		if(nums1[r1]<nums2[r2]) {
    			r1++;
    		}
    		if(nums1[r1]==nums2[r2]){
    			result.add(nums1[r1]);
    			r1++;
    			r2++;
    			
    		}
    	}
    	int[] ans = new int[result.size()];
        int posi = 0;
        for (int num : result) ans[posi++] = num;

    	
    	return ans;
    }
	
	
	
	public static void main(String[] args) {
		l350 l=new l350();
		int [] nums1= {1,2,2,1};
		int [] nums2= {2,2};
		int [] nu=l.intersect(nums1, nums2);
		for (int i : nu) {
			System.out.println(i);
		}
	}
}
