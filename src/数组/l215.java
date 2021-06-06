package 数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 
 * 
 * @author 家毅
 *
 */
public class l215 {
	
	public static int findKthLargest(int[] nums, int k) {
		Arrays.parallelSort(nums);
		

		return nums[(nums.length)-k];
    }
	public static void main(String[] args) {
		int nums[]= {3,2,3,1,2,4,5,5,6};
		int k=4;
		System.out.println(findKthLargest(nums, k));
	}
}
