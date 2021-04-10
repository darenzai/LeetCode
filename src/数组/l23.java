package สýื้;

public class l23 {
	
	public int removeElement(int[] nums, int val) {
        
		int j=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[j]=nums[i];
				j++;
			}
		}
		
		return j;
    }
	
	
	public static void main(String[] args) {
		l23 l=new l23();
		int nums []= {3,2,2,3};
		int l1=l.removeElement(nums, 3);
		System.out.println(l1);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
