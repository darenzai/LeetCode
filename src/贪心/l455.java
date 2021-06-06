package 贪心;

import java.util.Arrays;

public class l455 {
	
	public static  int findContentChildren(int[] g, int[] s) {
        Arrays.parallelSort(g);
        Arrays.parallelSort(s);
        int child=0;
        int cookie=0;
        while(child<g.length&&cookie<s.length) {
        	if(g[child]<=s[cookie])
        		++child;
        	++cookie;
        }
		return child;
    }
	
	
	public static void main(String[] args) {
		int []g = {1,2,3};
		int s[] = {1,1};
		System.out.println(findContentChildren(g, s));
	}	
}
