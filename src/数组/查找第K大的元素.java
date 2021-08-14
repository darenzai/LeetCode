package 数组;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 查找第K大的元素 {

	public int maxK(int nums[], int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int num : nums) {
			if (heap.size() < k) {
				heap.add(num);
			} else if (heap.peek() < num) {
				heap.poll();
				heap.add(num);
			}

		}
		return heap.poll();
	}

	public static void main(String[] args) {

		查找第K大的元素 k = new 查找第K大的元素();

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {

			String str = in.next();
			String[] s = str.substring(1, str.length() - 1).split(",");
			int[] arr = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				arr[i] = Integer.valueOf(s[i]);
			}
			// 直接调用sort方法，基于快排的
			
			
			// 自己写的快排方法
			int result = k.maxK(arr, 3);
			System.out.println(result);

			
		}
	}
}
