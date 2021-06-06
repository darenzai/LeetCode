package 排序;

import java.util.Arrays;

public class l88 {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=0;i!=n;++i) {
			nums1[m+1]=nums2[i];
		}
		Arrays.parallelSort(nums1);
    }
	
	public static void main(String[] args) {
		
	}
}
