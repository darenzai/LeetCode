package 数组;

public class o49 {
	
	public int nthUglyNumber(int n) {
		
		int num=0;
		int max=0;
		
		while(n>0) {
			++num;
			if(num%2==0||num%3==0||num%5==0) {
				max=num;
				n--;
			}
		}
	
		return max;
    }
	
	
	public static void main(String[] args) {
		o49 o=new o49();
		System.out.println(o.nthUglyNumber(10));
	}
}
