
public class o63 {
	public static void main(String[] args) {
		
		int [] nums= {7,6,4,3,1};
		int max=Integer.MIN_VALUE;
		int len=nums.length-1;
		for (int i = len; i >=0; i--) {
			for (int j = i-1; j>=0; j--) {
				if((nums[i]-nums[j])>max) {
					max=nums[i]-nums[j];
				}
			}
		}
		System.out.println(max>=0?max:0);
	}
}
