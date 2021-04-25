package 链表;

import java.util.HashSet;
import java.util.Set;

import 链表.l141.ListNode;

public class l142 {

	class ListNode<T> {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {
		ListNode flag = head;
		while (flag.next != null) {
			ListNode fast = head;
			while(fast.next!=flag) {
				
				if(fast==flag) {
					return flag;
				}
				fast=fast.next;
				
			}
			
			flag =flag.next;
		}

		return null;
	}

	public static void main(String[] args) {

	}
}
