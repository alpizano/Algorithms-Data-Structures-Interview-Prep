import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {

		boolean valid = true;
		Stack<Character> opStack = new Stack<>();

		// valid if empty
		if (s.isEmpty()) {
			return true;
		}
		// can't be valid if string length is odd number
		else if (!(s.length() % 2 == 0)) {
			return false;
		} 
		else {
			for (int i = 0; i <= s.length() - 1; i++) {
				// if open bracket, push()
				if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
					opStack.push(s.charAt(i));
				}
				// if closed bracket, pop() and check, but make sure stack is not empty first
				else if (!opStack.isEmpty()) {
					if (s.charAt(i) == ')' && opStack.pop() != '(') {
						return false;
					} 
					else if (s.charAt(i) == '}' && opStack.pop() != '{') {
						return false;
					} 
					else if (s.charAt(i) == ']' && opStack.pop() != '[') {
						return false;
					}
				}
			}
		}

		// stack should be empty at end, if not, duplicate open brackets were pushed in and never popped
		if (opStack.size() > 0) {
			return false;
		}

		return valid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test1 = "()";
		String test2 = "()[]{}";
		String test3 = "(]";
		String test4 = "([)]";
		String test5 = "{[]}";
		String test6 = "]";
		String test7 = "){";
		String test8 = "";

		Solution sol = new Solution();

		System.out.println(sol.isValid(test1));
		System.out.println(sol.isValid(test2));
		System.out.println(sol.isValid(test3));
		System.out.println(sol.isValid(test4));
		System.out.println(sol.isValid(test5));
		System.out.println(sol.isValid(test6));
		System.out.println(sol.isValid(test7));
		System.out.println(sol.isValid(test8));

	}

}
