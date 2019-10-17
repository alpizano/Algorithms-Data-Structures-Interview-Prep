import java.util.Stack;

public class Solution {
	
	public int balancedStringSplit(String s) {
		String[] strArray = s.split("");
		
		Stack<String> stack = new Stack<>();
		int combinations = 0;
		
		for(int i=0; i<=strArray.length-1; i++) {
			if(!stack.isEmpty() ) {
				if(!stack.peek().equals(strArray[i])) {
					while(!stack.peek().equals(strArray[i])) {
						stack.pop();					
					}
				
					combinations++;
				}
				else {
					stack.push(strArray[i]);
				}
			}
			else {
				stack.push(strArray[i]);
			}
		}
		
		return combinations;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "RLRRLLRLRL";
		
		Solution test = new Solution();
		
		test.balancedStringSplit(s);

	}

}
