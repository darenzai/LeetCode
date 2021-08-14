package 字符串;

import java.util.Arrays;

public class 判定是否互为字符重排 {
	public boolean CheckPermutation(String s1, String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.parallelSort(c1);
		Arrays.parallelSort(c2);
		if(c1.length!=c2.length) {
			return false;
		}
		
		for (int i = 0; i <c1.length-1; i++) {
			if(c1[i]!=c2[i]) {
		 		return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		
	}
}
