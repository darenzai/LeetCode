package 字符串;

public class l14 {
	
	 public String longestCommonPrefix(String[] strs) {
	        if(strs.length==0)return "";
	        String ans=strs[0];
	        int minLen=Integer.MAX_VALUE;
	        for(int i=0;i<strs.length;i++){
	            if(strs[i].length()<minLen){
	                minLen=strs[i].length();
	            }
	        }
	        
	        for(int i=1;i<strs.length;i++){
	            int j=0;
	            for(;j<ans.length() && j<minLen;j++){
	                if(ans.charAt(j)!= strs[i].charAt(j)){
	                    break;
	                }
	            }
	            ans=ans.substring(0,j);
	            if(ans.equals(""))return ans;
	        }

	        return ans;
	    }
    
	
	public static void main(String[] args) {
		String [] strs = {"flower","flow","flight"};
		l14 l=new l14();
		System.out.println(l.longestCommonPrefix(strs));
		
		
	}
}
