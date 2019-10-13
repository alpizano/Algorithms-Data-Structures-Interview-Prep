import java.util.Map;
import java.util.HashMap;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		HashMap<String,Integer> map = new HashMap<>();
		StringBuilder sb_control = new StringBuilder();
		StringBuilder sb_lcp = new StringBuilder();
		String str_lcp = "";
		boolean containsVal = true;
		
		for(int i=0; i<=strs.length-1; i++) {
			map.put(strs[i], i);
		}
		
		int x = 0;
		for(int y=0; y<=strs.length-1; y++) {
			sb_control.append(strs[0].charAt(x));
			for(int j=y+1; j<=strs.length-1; j++) {
				if(!strs[j].contains(sb_control.toString())) {
					containsVal = false;
				}
				if(j == strs.length-1 && containsVal == true) {
					str_lcp = sb_control.toString();
				}
				else {
					break;
				}
				x++;
			}
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
		String[] strs = new String[] {"flower", "flow", "flight"};
		
		Solution test = new Solution();
		
		System.out.println(test.longestCommonPrefix(strs));
		
	
		
	}

}
