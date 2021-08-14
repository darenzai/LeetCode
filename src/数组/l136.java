package 数组;

public class l136 {
	
	public int singleNumber(int[] nums) {
        int [] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j) {
                	if(nums[i]==nums[j]){
                        n[i]=1;
                    }
                }
            	
            }
        }
        for (int i = 0; i < n.length; i++) {
			if(n[i]==0) {
				return nums[i];
			}
		}
        return 	0;
    }
	
	public static void main(String[] args) {
		l136 l=new l136();
		int nums[] = {2,2,1};
		System.out.println(l.singleNumber(nums));
	}

}
