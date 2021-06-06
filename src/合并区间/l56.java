package 合并区间;

import java.util.ArrayList;
import java.util.Arrays;

public class l56 {
	public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> result=new ArrayList<>();
        if(intervals==null||intervals.length<2) {
        	return intervals;
        }
        Arrays.parallelSort(intervals,(a,b)->a[0]-b[0]);
        for(int[] interval:intervals) {
        	if(result.size()==0||interval[0]>result.get(result.size()-1)[1]) {
        		result.add(interval);
        		
        	}else {
				result.get(result.size()-1)[1]=Math.max(result.get(result.size()-1)[1], interval[1]);
			}
        }
        
        return result.toArray(new int[result.size()][2]);
    }
	
	public static void main(String[] args) {
		
	}
}
