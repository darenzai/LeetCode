package 二分法;

public class l29 {
	
	
	
	public int divide(int dividend, int divisor) {
		if(dividend==Integer.MIN_VALUE&&divisor==-1)
			return Integer.MAX_VALUE;
		
		boolean k=(dividend>0&&divisor>0)||(dividend<0&&divisor<0);
		int result=0;
		dividend=-Math.abs(dividend);
                divisor=-Math.abs(divisor);
		while(dividend<=divisor) {
			int temp=divisor;
			int c=1;
			while(dividend-temp<=temp) {
				temp=temp<<1;
				c=c<<1;
			}
			dividend-=temp;
			result+=c;
		}
		return k?result:-result;
	}

	public static void main(String[] args) {
		l29 l=new l29();
		System.out.println(l.divide(10, 3));
	}
}
