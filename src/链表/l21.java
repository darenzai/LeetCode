package 链表;

import 链表.l142.ListNode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。 新链表是通过拼接给定的两个链表的所有节点组成的。
 * 	输入：l1 = [1,2,4], l2 = [1,3,4]
	输出：[1,1,2,3,4,4]
 * @author 家毅
 *
 */
public class l21 {
/*
 *  归并排序 if判断l1 >l2 就把l1的添加到新的链表中
 */
	class ListNode<T> {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode<Integer> l3=new ListNode<Integer>(-1);
       ListNode p=l3;
        
       if(l1==null) {
    	   return l2;
       }
       if(l2==null) {
    	   return l1;
       }
		while(l1!=null ||l2!=null) {
        	if(l1.val<=l2.next.val) {
        		p.next=l1;
        		l1=l1.next;
        	}else {
        		p.next=l2;
        		l2=l2.next;
        	}
        	p=p.next;
        	
        }
		p.next = l1 == null ? l2 : l1;
		
		return p;
    }
	
	public static void main(String[] args) {
		
	}

}
