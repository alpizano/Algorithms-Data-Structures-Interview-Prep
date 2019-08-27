import java.util.Stack;

class Solution {
    public int reverse(int x) {
    	
    	String xStr = Integer.toString(x);
    	int ans = 0;
    	
    	Stack<String> strStack = new Stack<>();
    	Stack<Integer> numStack = new Stack<>();
    	
    	for(int i=0; i<xStr.length()-1; i++) {
    		strStack.push(Character.toString(xStr.charAt(i)));
    	}
    	
    	while(!strStack.isEmpty()) {
    		xStr = xStr + strStack.pop();
    	}
    	
    	System.out.println(xStr);
    	ans = Integer.parseInt(xStr);
    	
    	return ans;
    	
    }
    
    
    public static void main(String[] args) {
    	
    	Solution solution = new Solution();
    	int x = 321;
    	
    	solution.reverse(x);
    	System.out.println(solution.reverse(x));
    	
    	
    	
    	
    }
    
    
    
}