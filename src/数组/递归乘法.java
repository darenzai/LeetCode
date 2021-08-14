package 数组;

public class 递归乘法 {
	
	 public int multiply(int A, int B) {
		
		 if(A==0||B==0) {
			 return 0;
		 }
		 if(A<B) {
			 return B+multiply(A-1, B);
		 }
		
		
		 return A+multiply(A,B-1);
	    }
	
	



	public static void main(String[] args) {
		递归乘法 d=new 递归乘法();
		System.out.println();
		 int x=5;
		 System.out.println((x+5)/3);
	}
	
}
