import java.util.HashMap;

public class Solution {
	
	public int strStr(String haystack, String needle) {
		
		HashMap<String, Integer> map = new HashMap<>();
		int index = 0;
		
		for(int i=0; i<=haystack.length()-1; i++) {
			map.put(String.valueOf(haystack.charAt(i)), i);
		}
		
		for(int i=0; i<=needle.length()-1; i++) {
		if(map.containsKey(String.valueOf(needle.charAt(i)))) {
			index = map.get(String.valueOf(needle.charAt(i)));
		}
		}
		
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
