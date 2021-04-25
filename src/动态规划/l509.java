package 动态规划;

import java.util.ArrayList;
import java.util.Arrays;

public class l509 {
	
//	public static int fib(int n) {
//		int m;
//        for(int i=0;i<n;i++){
//            
//        }
//        return 0;
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=4;
		j+=1;
		int arr[]=new int[j];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		if(j==1) {
			System.out.println(1);
		}
		if(j==0) {
			System.out.println(0);
		}
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			
		}
		System.out.println(arr[arr.length-1]);
		
		
		
		
	}

}
