package 树;

import java.util.Arrays;

public class l105 {
	
	
	 
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
	
	
	/**
	 * 根据一棵树的前序遍历与中序遍历构造二叉树。
	 * {
	 * 		思路先找到根节点，分出左子树右子树，然后递归的去找跟 分左，右
	 * @param args
	 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		if(preorder==null||inorder==null) {
			return null;
		}
		TreeNode root =new TreeNode(preorder[0]);
		for (int i = 0; i < preorder.length; i++) {
			if(preorder[0]==inorder[i]) {
				int [] pre_left=Arrays.copyOfRange(preorder, 1, i+1);
				int []pre_right=Arrays.copyOfRange(preorder, i+1, preorder.length);
				int []in_left=Arrays.copyOfRange(inorder, 0, i);
				int []in_right=Arrays.copyOfRange(inorder, i+1, in_left.length);
				root.left=buildTree(pre_left,in_left);
				root.right=buildTree(pre_right, in_right);
				break;
			}
		}
		return root;
    }
	
	private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
		int root_val=preorder[p_start];
		TreeNode root=new TreeNode(root_val);
		
		
		return null;
	}

	public static void main(String[] args) {
		
	}

}
