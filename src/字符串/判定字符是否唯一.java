package 字符串;

public class 判定字符是否唯一 {
	public boolean isUnique(String astr) {
		int n=astr.length()-1;
		char [] c=astr.toCharArray();
		int i=0;
		if(n==1) {
			if(c[0]==c[1]) {
				return false;
			}else {
				return true;
			}
		}
		while(i<n-1) {
			int j=i+1;
			while(c[i]!=c[j]&&j<n) {
				j++;
			}
			if(c[i]==c[j]) {
				return false;
			}
			i++;
		}
		return true;
    }
	public static void main(String[] args) {
		判定字符是否唯一 p=new 判定字符是否唯一();
		String astr="aa";
		System.out.println(p.isUnique(astr));
	}
}
