
public class StringReverse {
	 public void reverseString(char[] s) {
	        
		 int j = s.length-1;
		
		 for(int i =0; i <= s.length -1; i++ ) {
			 char temp = s[i] ;
			 s[i] = s[j];
			 s[j] = temp;
		 }
	    }
	 
	 public static void main(String[] args) {
		 char[] test = {'H', 'e', 'l', 'l' ,'o' };
		 
		 Solution
		 
	 }

}
