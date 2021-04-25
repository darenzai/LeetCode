package 链表;

import 链表.l141.ListNode;

public class l148 {
	
	class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 public ListNode sortList(ListNode head) {
	     if(head==null||head.next==null) {
	    	 return head;
	    	 
	     }
		 int length=0;
		 ListNode node =head;
		 while(node!=null) {
			 length++;
			 node=node.next;
			 
		 }
	     ListNode dummyHead=new ListNode(0);
	     dummyHead.next=head;
		 for(int subLen=1;subLen<length;subLen<<=1) {
			 ListNode prev=dummyHead;
			 ListNode curr=dummyHead.next;
			 while(curr!=null) {
				 ListNode head_1=curr;
				 for(int i=1;i<subLen && curr !=null && curr.next!=null;i++) {
					 curr=curr.next;
				 }
			 }
		 }
	     
	     
	     return  head;
	    }
}
