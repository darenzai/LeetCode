package 排序;

public class test {
	
	public void insert_sort(int []nums,int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = i;j>0&& nums[j]<nums[j-1]; --j) {
				swap(nums[j], nums[j-1]);
			}
		}
	}
	public void swap(int i,int j) {
		int tmp=0;
		tmp=i;
		i=j;
		j=tmp;
	}
	
	public static void main(String[] args) {
		
	}
}	
