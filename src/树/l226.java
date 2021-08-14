package 树;

import 树.l105.TreeNode;

public class l226 {
	
	 public class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	         this.right = right;
	      }
	  }
	
	public TreeNode invertTree(TreeNode root) {
		
		if(root==null) {
			return root;
		}
		TreeNode tmp=root.right;
		root.right=root.left;
		root.left=tmp;
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
