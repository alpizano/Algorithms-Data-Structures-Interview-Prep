
public class StringReverse {
	 public void reverseString(char[] s) {
	        
		 int j = s.length-1;
		 
		 if(s.length == 0 ) {
			 
		 }

				 // even
		 else if( s.length %2 == 0 && s.length != 0) {
				 for(int i =0; i <= (s.length-1)/2; i++ ) {
				 char temp = s[i] ;
				 s[i] = s[j];
				 s[j] = temp;
				 j--;
				 }
			 }
			 else {
				 for(int i =0; i < (s.length-1)/2; i++ ) {
				 char temp = s[i] ;
				 s[i] = s[j];
				 s[j] = temp;
				 j--;
				 }
			 }
		 
	    }
	 
	 public static void main(String[] args) {
		 char[] test = {'H', 'e', 'l', 'l' ,'o' };
		 char[] test2 = {};
		 
		 System.out.println(test2.length);
		 
		 StringReverse blah =  new StringReverse();
			System.out.println(test);

		blah.reverseString(test);
		blah.reverseString(test2);
		
		System.out.println(test);
		 
		int ans = 5/2;
		System.out.println(ans);
	 }

}
