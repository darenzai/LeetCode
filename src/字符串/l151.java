package 字符串;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.sound.midi.Soundbank;

public class l151 {
	
	
	public static String reverseWords(String s) {
		
		String ss="";
		StringTokenizer st = new StringTokenizer(s," ,\"\"''\n#");
		List<String> wordList = new ArrayList<>();
		Stack<String> stack=new Stack<String>();
		while (st.hasMoreElements()) {
		    //wordList.add(st.nextToken().toLowerCase());
		   stack.push(st.nextToken());
		}
		if(stack.size()==1) {
			return stack.pop();
		}
		while(stack.size()!=0) {
			ss+=stack.pop()+" ";
			if(stack.size()==1) {
				ss+=stack.pop();
			}
			
			
		}
		return ss;
		

    }
	
	
	
	public static void main(String[] args) {
		String s="EPY2giL ";
		System.out.println(reverseWords(s));
}
}