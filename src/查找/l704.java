package 查找;

public class l704 {
	public  static int search(int[] nums, int target) {
	      
		int p=0; 
		int d=nums.length-1;
		int privot=0;
		while(p<=d) {
			privot=p+(d-p)/2;
			if(nums[privot]==target) {
				return privot;
			}
			if(target>nums[privot]) {
				p=privot+1;
			}else {
				d=privot-1;
			}
    }
    return -1;
		

    }
	public static void main(String[] args) {
		
	}
}
