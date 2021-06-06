package 快慢指针;



public class l234 {
	
	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	
	 public static boolean isPalindrome(ListNode head) {
		 if(head==null||head.next==null)
			 return true;
		 ListNode p=head;
		 ListNode fast=head;
		 ListNode slow=head;
		 ListNode prev=null;
		 ListNode nextNode=null;
		 while(fast!=null&&fast.next!=null) {
			 fast=fast.next.next;
			 nextNode=slow.next;
			 slow.next=prev;
			 prev=slow;
			 slow=nextNode;
		 }
		 while(fast!=null) {
			 slow=slow.next;
		 }
		 while(slow!=null) {
			 if(prev.val!=slow.val) {
				 return false;
			 }
			 prev=prev.next;
			 slow=slow.next;
		 }
		 return true;
	    }
	
	public static void main(String[] args) {
	ListNode head=null;
	head.val=1;
	head.next.val=2;
	head.next.next.val=2;
	head.next.next.next.val=1;
	System.out.println(isPalindrome(head));
	
	}
}
