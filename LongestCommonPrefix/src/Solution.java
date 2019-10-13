
import java.util.HashMap;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb_control = new StringBuilder();
		String str_lcp = "";
		boolean containsVal = true;
		
		if(strs.length == 0 ) {
			return "";
		}
		else if(strs.length ==1 ) {
			return strs[0];
		}
		else {
			int i=0;
			int j=i+1;
			int c = 0;
			while(c <= strs[j].length()-1 && !strs[0].isEmpty() && !strs[j].isEmpty() && String.valueOf(strs[0].charAt(c)).equals(String.valueOf(strs[j].charAt(c)))) {
				sb_control.append(strs[0].charAt(c));
				
				if(j == strs.length-1) {
					str_lcp = sb_control.toString();
					j =0;
					
				}
				else {
					
					j++;
				}
				
			c++;
				
			}
			
			
			
//			
//		int x= 0;
//			outerloop:
//		for(int i=0; i<=strs.length-1;i++) {
//			sb_control.append(strs[0].charAt(x));
//			for(int j=1; j<=strs.length-1; j++) {
//				if(!String.valueOf(strs[j].charAt(x)).equals(String.valueOf(strs[0].charAt(x)))) {
//					containsVal = false;
//				}
//				if(j == strs.length-1 && containsVal == true) {
//					str_lcp = sb_control.toString();
//				}
//				else if(j == strs.length-1 && containsVal == false) {
//					break outerloop;
//				}
//				
//			}
//			x++;
//		}
		}
		
		if(sb_control.length() == 0) {
			return "";
		}
		else {	
		return str_lcp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strs = new String[] {"flower", "flow", "flight"};
//		String[] strs2 = new String[] {"dog", "racecar", "car"};
//		String[] strs3 = new String[0];
//		String[] strs4 = new String[] {"a"};
//		String[] strs5 = new String[] {"a", "b"};
//		String[] strs6 = new String[] {"c", "c"};

		String[] strs7 = new String[] {"c","acc","ccc"};
		String[] strs8 = new String[] {"", "b"};
		
		Solution test = new Solution();
		
//		System.out.println(test.longestCommonPrefix(strs));
//		System.out.println(test.longestCommonPrefix(strs2));
//		System.out.println(test.longestCommonPrefix(strs3));
//		System.out.println(test.longestCommonPrefix(strs4));
//		System.out.println(test.longestCommonPrefix(strs5));
//		System.out.println(test.longestCommonPrefix(strs6));
		System.out.println(test.longestCommonPrefix(strs7));
		System.out.println(test.longestCommonPrefix(strs8));
		
	
		
	}

}
