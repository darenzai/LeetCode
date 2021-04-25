package 双指针;

public class l11 {
	
	public static int maxArea(int[] height) {
		int p=0;
		int d=height.length-1;
		int max=0;
		while(p<d) {
			max=height[p]<height[d]?Math.max(max, (d-p)*height[p++]):Math.max(max,(d-p)*height[d--]);
		}
		return max;
    }
	
	
	public static void main(String[] args) {
		
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
		
	}
}
