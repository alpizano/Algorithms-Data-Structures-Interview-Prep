
public class Solution {

	public static String reverse(String str) {
	    
	    if(str.length() < 2)
	      return str;
	    
	    return reverse(str.substring(1)) + str.charAt(0);
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Time complexity: O(n^2) due to looping and concatenation");
		//System.out.println("Space complexity: O(n) can't go any faster b/c strings immutable");
		
		String sample = "Blah";
		//String sample = "Reverse";
		String output = "";
		
		System.out.println("\nBefore reversing: " + sample);
		
		for(int i=0; i <= sample.length()-1; i++) {
			output = sample.charAt(i) + output;
		}
		
		System.out.println("After reversing: " + output);
				

		//System.out.println("Time complexity: O(n) using char[] array in-place swap);
		//System.out.println("Space complexity: O(n) can't go any faster b/c strings immutable");
		
		System.out.println("\nBefore reversing: " + sample);
		char[] charStr = sample.toCharArray();
		char temp;
		int j = charStr.length-1;
		
		for(int i=0; i<=charStr.length-1; i++) {
			// pointers will be on the same index on odd number length char[] array
			if(charStr.length % 2 != 0 && i == j) {
				break;
			}
			// pointers will be side-by-side on even number length char[] array
			else if(charStr.length % 2 == 0 && j-i == 1) {
				break;
			}
			// in-place swap chars to reverse
			else {
			temp = charStr[j];
			charStr[j] = charStr[i];	
			charStr[i] = temp;
			j--;
			}
		}
		
		
		for(int i=0; i<=charStr.length-1; i++) {
			System.out.print(charStr[i]);
		}
		
		System.out.println();
		System.out.println(Solution.reverse("Alberto"));
		
		

	}

}
