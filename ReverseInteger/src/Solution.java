import java.util.Stack;

class Solution {
    public int reverse(int x) {
    	Stack<String> strStack = new Stack<>();
    	
    	String xStr = Integer.toString(x);
    	String posStr = "";
    	String negStr = "-";
    	int ans = 0;
    	boolean neg = false;
    		
    	for(int i=0; i<xStr.length(); i++) {
    		if ( xStr.charAt(i) == '-') {
    			neg = true;
    			continue;
    		}
    		
    		strStack.push(Character.toString(xStr.charAt(i)));
    	}
    	
    	while(!strStack.isEmpty()) {
    		if(neg == true) {
    			negStr = negStr + strStack.pop();
    		}
    		else {
    		posStr = posStr + strStack.pop();
    		}
    	}
    	
    	if(neg == true) {
    		if (Long.parseLong(negStr) > Integer.MAX_VALUE || Long.parseLong(negStr) < Integer.MIN_VALUE) {
    			return 0;
    		}
    		else {
    		ans = Integer.parseInt(negStr);
    		}
    	}
    	else {
    		if (Long.parseLong(posStr) > Integer.MAX_VALUE || Long.parseLong(posStr) < Integer.MIN_VALUE) {
    			return 0;
    		}
    		else {
    		ans = Integer.parseInt(posStr);
    		}
    	}
    	
    	return ans;
    	
    }
    
    
    public static void main(String[] args) {
    	
    	Solution solution = new Solution();
    	int x = 321;
    	int x2 = 120;
    	int x3 = -123;
    	long x4 = 9646324351L;
    	int x5 = 1534236469; // no overflow
    	
    	//System.out.println(solution.reverse(x));
    	//System.out.println(solution.reverse(x2));
    	//System.out.println(solution.reverse(x3));
    	System.out.println(solution.reverse(x5));
    	
    	
    	
    	
    	
    }
    
    
    
}