package 树;

import 树.l226.TreeNode;

public class 最小高度树 {
	
	public TreeNode sortedArrayToBST(int[] nums) { 
	    if(nums.length==0) {
	    	return null;
	    }
		return sortedArrayToBST(nums, 0, nums.length-1);
	    }
	public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid=(start+end)>>1;
		TreeNode root=new TreeNode(nums[mid]);
		root.left=sortedArrayToBST(nums, start, mid-1);
		root.right=sortedArrayToBST(nums, mid+1, end);
		return root;
		
		
	}
	public static void main(String[] args) {
		 
		
	
	}
}
