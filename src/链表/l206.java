package 链表;

import java.util.Arrays;

import 链表.l148.ListNode;

public class l206 {
	
	class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	public ListNode reverseList(ListNode head) {
        int length=0;
        int arr []={};
        while(head.next!=null){
            arr[length]=head.val;
            length++;
        }
        
        for (int i= arr.length = 0; i >0&&head.next!=null; i--) {
			head.val=arr[i];
			head=head.next;
		}
        return head;

    }

	public static void main(String[] args) {
		
		while
		}
		
	}

}
