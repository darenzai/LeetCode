package 双指针;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class l1 {
	
    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int []{-1,-1};
        if(nums.length==2) {
        	return new int [] {0,1};
        }
        int[] team =Arrays.copyOf(nums, nums.length);
        Arrays.parallelSort(team);
        int p=0;
        int d=nums.length-1;
        while(true) {
        	if(team[p]+team[d]==target) {
        		
        		break;
        	}
        	if(team[p]+team[d]>target) {
        		d--;
        		continue;
        	}
        	if(team[p]+team[d]<target) {
        		p++;
        		continue;
        		
        	}
        }
       for(int i=0;i<nums.length;i++){
    	   if (nums[i] == team[p] && result[0] == -1) {
               result[0] = i;
               continue;
           }
           if (nums[i] == team[d] && result[1] == -1) {
               result[1] = i;
           }


       }
    
    	
    	return result;
    }
    
    
   public static void main(String[] args) {
	int [] nums = {3,2,4};
	
	int [] arr=twoSum(nums,6);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}

}
