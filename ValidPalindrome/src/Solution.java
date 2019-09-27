import java.util.Stack;

public class Solution {
	
	public static String filterString(String s) {
		String output = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			if(Character.isLetterOrDigit(s.charAt(i))); {
				output = output + s.charAt(i);
			}
		}
		return output;
	}
	public boolean isPalindrome(String s) {
		
		String filtered_string = Solution.filterString(s);
		Stack<String> stack = new Stack<>();
		
		int j = 0;
		while(!stack.isEmpty()) {
			for(int i=0; i<=filtered_string.length()-1; i++) {
				stack.push(String.valueOf(filtered_string.charAt(i)));
			}
			if(!(String.valueOf(filtered_string.charAt(j)).equals(stack.pop()))) {
				return false;
			}
			j++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s1 = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		
		Solution test = new Solution();
		
		//System.out.println(test.isPalindrome(s1));
		System.out.println(test.isPalindrome(s2));


	}

}
