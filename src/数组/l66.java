package 数组;

public class l66 {
	
	
	public int[] plusOne(int[] digits) {
        int n=digits.length-1;
       
        int nums[] =new int [n+2];
        digits[n]=digits[n]+1;
        if(digits[n]>=10){
            int n1=digits[n]/10;
            int n2=digits[n]%10;
            
            for(int i=0;i<n;i++){
                nums[i]=digits[i];
            }
            nums[n]=n1;
            nums[n+1]=n2;
            return nums;
        }
        return digits;
         
        
	}
	
	
	public static void main(String[] args) {
		
		l66 l=new l66();
		int [] digits= {1,2,9};
		digits=l.plusOne(digits);
		for (int i : digits) {
			System.out.println(i);
		}
		
	}
}
