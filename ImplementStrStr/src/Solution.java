import java.util.HashMap;

public class Solution {
	
	public int strStr(String haystack, String needle) {
		int index = 0;
		
		for(int i=0; i<=needle.length()-1; i++) {
			if(haystack.indexOf(needle) != -1) {
			index = haystack.indexOf(needle);
		}
			else {
				return -1;
			}					
	}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack = "hello";
		String needle = "ll";
		
		Solution test = new Solution();
		
		
		//String haystack = "aaaaa";
		//String needle  = "bba";
		
		System.out.println(test.strStr(haystack, needle));
	}

}
