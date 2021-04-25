package 链表;

import 链表.l141.ListNode;

public class l876 {
	
	class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        ListNode lowPonit=head;
	        ListNode fastPonit=head;
	        while(lowPonit!=null&&lowPonit.next!=null) {
	        	lowPonit=lowPonit.next;
	        	fastPonit=fastPonit.next.next;
	        	
	        }
	    	return lowPonit; 
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
