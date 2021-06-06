package 双指针;
/**
 * 	输入：S = "ab##", T = "c#d#"
	输出：true
	解释：S 和 T 都会变成 “”。
 * 
 * 
 */
public class l844 {
	
public static boolean backspaceCompare(String S, String T) {
	int i = S.length() - 1, j = T.length() - 1;
    int skipS = 0, skipT = 0;

    while (i >= 0 || j >= 0) {
        while (i >= 0) {
            if (S.charAt(i) == '#') {
                skipS++;
                i--;
            } else if (skipS > 0) {
                skipS--;
                i--;
            } else {
                break;
            }
        }
        while (j >= 0) {
            if (T.charAt(j) == '#') {
                skipT++;
                j--;
            } else if (skipT > 0) {
                skipT--;
                j--;
            } else {
                break;
            }
        }
        if (i >= 0 && j >= 0) {
            if (S.charAt(i) != T.charAt(j)) {
                return false;
            }
        } else {
            if (i >= 0 || j >= 0) {
                return false;
            }
        }
        i--;
        j--;
    }
    return true;


    }
	
	public static void main(String[] args) {
		String s="ab##";
		String t="c#d#";
		System.out.println(backspaceCompare(s, t));
	}
}
