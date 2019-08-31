import java.util.Stack;

public class Solution {
	   public boolean isValid(String s) {
		   
		   boolean valid = true;
		   //Stack<String> opStack = new Stack<>();
		   Stack<Character> opStack = new Stack<>();
		   
		   if(s.isEmpty()) {
			   return true;
		   }
		   
		   for(int i=0; i<=s.length()-1; i++) {
			  //opStack.push(Character.toString(s.charAt(i)));
			   if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
			   opStack.push(s.charAt(i));
			   }
			   else {
				   if(s.charAt(i) == ')' && opStack.pop() != '(') {
					   return false;
				   }
				   else if(s.charAt(i) == '}' && opStack.pop() != '{' ) {
					   return false;
				   }
				   else if(s.charAt(i) == ']' && opStack.pop() != '[' ) {
					   return false;
				   }
			   }
			   
		   }
		   
		
		   
	        return valid;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "()";
		String test2 = "()[]{}";
		String test3 = "(]";
		String test4 = "([)]";
		//String test5 = "{[]}";
		
		Solution sol = new Solution();
	
		System.out.println(sol.isValid(test1));
		System.out.println(sol.isValid(test2));
		System.out.println(sol.isValid(test3));
		System.out.println(sol.isValid(test4));
		//System.out.println(sol.isValid(test5));
		

	}

}
