package 数组;

public class l31 {
	
	
	 public  void nextPermutation(int[] nums) {
		 int n=nums.length-2;
		 int index=0;
		 //查找非降序的序列 即较小数
		 while(n>=0&&nums[n]>=nums[n+1]) {
			 n--;
		 }
		 //查找较大数
		 if(n>=0) {
			 int j=nums.length-1;
			 while(j>=0&&nums[n]>=nums[j]) {
				 j--;
			 }
			 //进行交换
			 swap(nums,n,j);
		 }
		 //后面的全部反转
		 reverse(nums,n+1);
		 
		 
	 }
	
	
	 //反转
	private void reverse(int[] nums, int i) {
		// TODO Auto-generated method stub
		int left=i,right=nums.length-1;
		while(left<right) {
			swap(nums, left, right);
			left++;
			right--;
		}
	}


	//进行交换
	private void swap(int[] nums, int n, int j) {
		// TODO Auto-generated method stub
		int tmp=nums[n];
		nums[n]=nums[j];
		nums[j]=tmp;
	}






	public static void main(String[] args) {
		l31 l=new l31();
		int [] nums= {4,5,2,6,3,1};
		l.nextPermutation(nums);
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]+"\t");
		}
	}
}
