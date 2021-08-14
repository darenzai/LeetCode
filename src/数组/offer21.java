package 数组;

public class offer21 {
	public int[] exchange(int[] nums) {
		int tmp=0;
        int r=nums.length-1;
        int l=0;
        if(r<1){
            return nums;
        }
        while(l<r){
            if((nums[l]%2)==0 && (nums[r]%2)!=0){
                
                tmp=nums[l];
                
                nums[l]=nums[r];
                nums[r]=tmp;
                l++;
                r--;
            }else if(nums[l]%2!=0&&nums[r]%2==0){
                l++;
               
            }else if(nums[l]%2==0&&nums[r]%2==0){
                r--;
            
            }


        }
        return nums;
    }
	public static void main(String[] args) {
		offer21 on=new offer21();
		int [] nums= {1,2,3,4};
		int [] nn=on.exchange(nums);
		for (int i = 0; i < nn.length; i++) {
			continue;
		}
				
	}
}
