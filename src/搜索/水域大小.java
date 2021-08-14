package 搜索;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 水域大小 {
	
	public int [] pondSizes(int [][] land) {
		List<Integer> list=new ArrayList<>();
		int temp;
		for(int i=0;i<land.length;i++) {
			for(int j=0;j<land[0].length;j++) {
				//深度优先遍历每一个节点
				temp=findPool(land,i,j);
				//如果返回的值不空则添加进队列
				if(temp!=0) {
					list.add(temp);
				}
			}
		}
		
			int []result =list.stream().mapToInt(Integer::valueOf).toArray();
			Arrays.parallelSort(result);
			return result;
		
	}
	
	//深度优先遍历
	private int findPool(int[][] land, int x, int y) {
		// TODO Auto-generated method stub
		//初始化池塘的值
		int num=0;
		//如果越界则直接返回
		if(x<0||x>=land.length||y<0||y>=land[0].length||land[x][y]!=0) {
			return num;
		}
		//如果访问了该节点则num++并标志位设为-1
		num++;
		land[x][y]=-1;
		//不断地从每个方向进行遍历
		num+=findPool(land,x+1,y);
		num+=findPool(land, x-1, y);
		num+=findPool(land, x, y+1);
		num+=findPool(land, x, y-1);
		num+=findPool(land, x+1, y+1);
		num+=findPool(land, x+1, y-1);
		num+=findPool(land, x-1, y+1);
		num+=findPool(land,x-1,y-1);
		//最后都递归的遍历完以后则返回值
		return num;
		
		
	}


	public static void main(String[] args) {
		
		水域大小 s=new 水域大小();
	
	}
}
