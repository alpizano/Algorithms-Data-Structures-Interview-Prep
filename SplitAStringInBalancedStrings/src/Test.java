import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		
	
	Stack<String> stack = new Stack<>();
	
	String[] s = new String[] {"R", "L", "R", "R", "L", "L", "R", "L", "R", "L"};
	
//	for(int i=0; i<=s.length-1; i++) {
//		stack.push(s[i]);		
//	}
	
	stack.push("R");
	stack.push("L");
	
	System.out.println(stack.pop());
	
	for(String s1: stack) {
		System.out.println(s1);
	}
	
	if(!stack.pop().equals("L")) {
		System.out.println("hello world");
	}
	
	for(String s1: stack) {
		System.out.println(s1);
	}
	
	}

}
