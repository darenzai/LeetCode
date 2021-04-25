package 链表;

import java.util.HashSet;
import java.util.Set;

public class l141 {
	
	

	  class ListNode<T> {
	     int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	  public static <T> boolean isLoopList(ListNode<T> head) {

		  Set set =new HashSet<>();
		  while(head!=null) {
			  if(!set.add(head)) {
				  return true;
			  }
			  head=head.next;
		  }
		  
		  return false;
			
		}
	
//	public static <T> boolean isLoopList(ListNode<T> head) {
//		ListNode<T> slowPointer,fastPointer;
//		slowPointer =fastPointer =head;
//		while(fastPointer!=null && fastPointer.next!=null) {
//			slowPointer =slowPointer.next;
//			fastPointer =fastPointer.next.next;
//			if(slowPointer==fastPointer) {
//				return true;
//			}
//		}
//		
//	
//		return false;
//		
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l141 l=new l141();
		
	}

}
