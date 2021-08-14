package 快慢指针;

import 快慢指针.l2.ListNode;
/**
 * 
 *  1，先将链表分成两半,2后面那个链表反转 3，然后比对每一个值 如果不相等则返回false
 * @author 家毅
 *
 */
public class 回文链表 {
	public boolean isPalindrome(ListNode head) {
		if(head==null) {
			return true;
			
		}
		ListNode midNode=findMidNode(head);
		ListNode secondHalfHead=reverseLinked(midNode.next);
		ListNode cur1=head;
		ListNode cur2=secondHalfHead;
		boolean palindrome=true;
		while(palindrome && cur2!=null) {
			if(cur1.val!=cur2.val)
				palindrome=false;
			cur1=cur1.next;
			cur2=cur2.next;
		}
		
		return  palindrome;
	}
	
	private ListNode reverseLinked(ListNode head) {
		// TODO Auto-generated method stub
		ListNode cur=head;
		ListNode prev=null;
		while(cur!=null) {
			ListNode nextTemp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nextTemp;
		}
		return prev;
		
	}

	private ListNode findMidNode(ListNode head) {
		ListNode fast=head;
		ListNode slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		
	}
	
	
}
