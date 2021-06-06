package 合并区间;

public class l57 {
	
	public static int[][] insert(int[][] intervals, int[] newInterval) {
			
		int res[][] =new int[intervals.length+1][2];
		int idx=0;
		int i=0;
		while(i<intervals.length && intervals[i][1]<newInterval[0]) {
			res[idx++]=intervals[i++];
		}
		while(i<intervals.length && intervals[i][0] <=newInterval[1]) {
			//newInterval[0]=Math.min()
		}
		return intervals;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
