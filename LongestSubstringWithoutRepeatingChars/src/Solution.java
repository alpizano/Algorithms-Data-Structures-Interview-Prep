
public class Solution {
	  public void lengthOfLongestSubstring(String s) {
		 int counter1 = 0;
	     int counter2 = 0; // records maximum length of substring
	     String memory = "";
	    //char memory = 0;
	     
	     for(int i=0; i < s.length(); i++) {
	    	 
	    	 for(int j=1; j < s.length(); j++)  {
	    		 if(i != j) {
	    		 memory = memory + s.charAt(i) + s.charAt(j);
	    		 counter1++;
	    		 counter2 = counter1;
	    		 if(counter1 > counter2) {
	    		 counter2++;
	    		 
	    		 }	    		 
	    	 }	 
	     }
	    	 memory = "";
	    	 counter1 = 0;
	     
	     
	    }
	     
	     
	     System.out.print("Maximum length is: " + counter2);

	     
	  }
	  
	  public static void main(String[] args) {
		  String test1 =  "abcabcbb";
		  
		  Solution func = new Solution(); // instantiate object to run method of class
		 
		 //System.out.println(func.lengthOfLongestSubstring(test1));
		  func.lengthOfLongestSubstring(test1);

}
}
