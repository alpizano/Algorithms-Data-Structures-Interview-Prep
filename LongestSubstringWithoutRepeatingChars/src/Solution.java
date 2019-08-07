
public class Solution {
	  public void lengthOfLongestSubstring(String s) {
		 int currCounter = 0;
	     int memCounter = 0; 
	     String currString = "";
	     String memString = "";     
	     int i = 0;
	     int j = i+1;
     
	   while (i < s.length() -1) {
		   currString = Character.toString(s.charAt(i));	
		   currCounter++;
	   while(j < s.length()-1) {
		   currString = currString + s.charAt(j);
		   currCounter++;
		   j++;
		   if (currString.substring(0,currCounter-1).contains(Character.toString(s.charAt(j)))) 
		   {
			   memString = currString.substring(0,currString.length()-1);
			   memCounter = currCounter-1;
			   System.out.println("string memory is: " + memString + " when i= "+ i + " and j = " + j);
			   System.out.println("They are equal at i=" + i + " and j= " + j);
			   System.out.println("Counter value is: " + memCounter);
			   
			   currString = "";
			   i = j-1;
			   j++;
			   System.out.println();
			  
			   
			   currCounter = 0;
			   break;		   
		   }
		   j++;
	   }
	   i++; 
	  }	   
	   System.out.println("Longest substring word is: " + memString);
	   System.out.println("Longest substring length is: " + memCounter);
	   System.out.println("------------------------------------------");
	  }
	  
	  public static void main(String[] args) {
		  String word1 =  "abcabcbb";
		  String word2  = "bbbbb";
		  String word3 = "pwwkew";
		  
		  Solution func = new Solution(); // instantiate object to run method of class
		 
		// func.lengthOfLongestSubstring(word1);
		 // func.lengthOfLongestSubstring(word2);
		 func.lengthOfLongestSubstring(word3);

}
}
