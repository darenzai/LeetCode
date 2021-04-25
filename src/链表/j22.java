package 链表;

import 链表.l141.ListNode;

public class j22 {
	class Solution {
		class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	}
	    public ListNode getKthFromEnd(ListNode head, int k) {
	    	ListNode fast=head;	
	    	ListNode low=head;
	    	while(k--!=0) {
	    		fast=fast.next;
	    		
	    	}
	    	while(fast!=null) {
	    		low=low.next;
	    		fast=fast.next;
	    	}
	    	
	    	return low;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
