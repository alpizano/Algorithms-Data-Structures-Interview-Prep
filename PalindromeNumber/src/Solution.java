public class Solution {

	public boolean isPalindrome(int x) {

		String xStr = Integer.toString(x); // convert int to string
		boolean palindrome = true;

		int tail = xStr.length() - 1;

		for (int head = 0; head < xStr.length(); head++) {
			if (xStr.charAt(head) != xStr.charAt(tail)) {
				palindrome = false;
			}
			tail--;
		}

		return palindrome;

	}

	public static void main(String[] args) {
		
		int x1 = 121;
	    int x2 = -121;
	    int x3 = 10;
	    
	    Solution test = new Solution();
	    
	    System.out.println(test.isPalindrome(x1));
	    System.out.println(test.isPalindrome(x2));
	    System.out.println(test.isPalindrome(x3));


	}

}
