package 字符串;

import java.util.Stack;

public class l20 {
	/**
	 * 用一个栈进行存储 然后将对应的压入栈 等到左侧的都没了'[' 就开始比较.pop里面的值
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		if(s.isEmpty()) {
			return true;
		}
		Stack<Character> stack=new Stack<Character>();
		for(char c:s.toCharArray()) {
			if(c=='(') {
				
			
				stack.push(')');
			}
			else if(c=='{') {
				stack.push('}');
			}
				
			else if(c=='[') {
				
		
				stack.push(']');
				
			}
			else if(stack.empty()||c!=stack.pop())
				return false;
			
		}
		if(stack.empty()) {
			
		
			return true;
		}
		return false;
		
		
    }
	
	
	public static void main(String[] args) {
		String s="()";
		System.out.println(isValid(s));
	}
}
