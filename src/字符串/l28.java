package 字符串;

public class l28 {
	
	
	public int strStr(String haystack, String needle) {
		int x=-1;
		if(needle.equals("")) {
			return 0;
		}
		char [] s1=haystack.toCharArray();
		char [] s2=needle.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if(s1[i]==s2[0]) {
				x=i;
				break;
			}
		}
		
		
		return x;
    }
	
	public static void main(String[] args) {
		l28 l=new l28();
		String haystack = "";
		String needle = "";
		System.out.println(l.strStr(haystack, needle));
	}
}
