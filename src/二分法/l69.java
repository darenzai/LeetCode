package 二分法;

public class l69 {
	public int mySqrt(int x) {
		
		long l=1;
		long r=(x)/2;
		long mid=0;
		long tmp;
		if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

		while(l<r) {
		
			
			mid=l + (r - l + 1) / 2;
			tmp=mid*mid;
			if(x==tmp) {
				return  (int)mid;
			}else if(tmp>x) {
				r=mid-1;
			}else {
				l=mid;
			}
			
		}
		
		return (int)r;
    }
	
	public static void main(String[] args) {
		l69 l=new l69();
		System.out.println(l.mySqrt(6));
	}
}
