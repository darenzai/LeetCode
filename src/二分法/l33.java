package 二分法;

public class l33 {
	 public int search(int[] nums, int target) {	     
		 int l1=0,l2=0,r1 = 0,r2=0;
	     int count=0;
	     int mid=0;
		 for (int i = 0; i < nums.length-1; i++) {
			 count++;
			if(nums[i]>nums[i+1]){
			r1=nums[i+1];
			
			break;
			}
			
		}
		 if(target>nums[count]) {
			 l2=count;
			 r2=nums.length-1;
			 while(l2<r2) {
				 mid=l2+(r2-l2+1)/2;
				 if(target==nums[mid]) {
					 return mid;
				 }else if(target>nums[mid]) {
					 l2=mid;
				 }else {
					 r2=mid-1;
				 }
				 
			 }
			 
			 
		 }
		 return 1;
	    }
	
	public static void main(String[] args) {
		l33 l=new l33();
		int nums []= {4,5,6,7,0,1,2};
		int target=4;
		System.out.println(l.search(nums, target));
	}
}
