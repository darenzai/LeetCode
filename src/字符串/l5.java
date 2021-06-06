package 字符串;

public class l5 {
	
	private static int p =0;
	private static int max=1;
	
public static  String longestPalindrome(String s) {
        
		//如果字符串小于2直接把字符串返回
		if(s.length()<2) {
			return s;
		}
		//会出现两种情况s = "babad" s="babbab" 所以要写两个判断
		for(int i=0;i<s.length();i++) {
			expandAroundCenter(s,i-1,i+1);
			expandAroundCenter(s, i, i+1);
		}
		//截取字符串长度
		return s.substring(p,p+max);
    }
	private static void expandAroundCenter(String s,int left,int right) {
		//如果字符串相等 而且没有超出边界
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			//判断大小 是不是比原始的大
			if(right-left+1>max) {
				//对字符串的位置进行标识
				
				max=right-left+1;
				
				p=left;
				
			}
			left--;
			right++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}
}
