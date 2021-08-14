package 数组;

public class offer15 {
	public static void main(String[] args) {
		double n=2.10000;
		double x=3;
		double sum=0;
		if(x<0) {
			x=Math.abs(x);
			for (int i = 0; i <=x; i++) {
				sum=n/2;
			}
			
		}else {
			sum=n;
			for (int i = 0; i < x; i++) {
				sum=sum*n;
			}
			
		}
		System.out.println(sum);
	}
}
