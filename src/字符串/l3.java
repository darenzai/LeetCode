package 字符串;

import java.util.HashSet;

public class l3 {
	
	 public static int lengthOfLongestSubstring(String s) {
		 
		 int l=s.length();
		 int p=0;
		 int d=0;
		 int max=Integer.MIN_VALUE;
		 HashSet<Character> set=new HashSet<>();
		 char [] arr=s.toCharArray();
		 if(s.length()<1) {
			 return s.length()==0?0:1;
		 }
		 while(d<l) {
			 while(!set.add(arr[d])) {
				 set.remove(arr[p]);
				 p++;
				 
			 }
			 max=Math.max(max, d-p+1);
			 d++;
		 }
		 
		 return max==Integer.MIN_VALUE?0:max;
		 
	 }
	
	
	public static void main(String[] args) {
		String s="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
