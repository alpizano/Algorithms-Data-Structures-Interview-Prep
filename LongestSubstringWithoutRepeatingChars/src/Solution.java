public class Solution {
	  public int lengthOfLongestSubstring(String s) {
		 int currCounter = 0;
	     int memCounter = 0; 
	     String currString = "";
	     String memString = "";     
	     int i = 0;
	     int j = i+1;
	     
	      if (s.length() == 0) {
	            return 0;
	        }
	      else if(s.length() == 1) {
	            return 1;
	        }
	      else if(s.length() == 2) {
	            if(s.charAt(0) == s.charAt(1)) {
	            	//System.out.println("The letters are equal");
					memString = s.substring(0,s.length()-1);
					memCounter = 1;               
	            }
	            else {
	            	memString = s.substring(0,s.length());
					memCounter = 2;  
	            }
	        }
	      else {	                
		   while (i < s.length() -1) {
			   currString = Character.toString(s.charAt(i));	
			  currCounter++;
		   while(j <= s.length()-1) {
			   currString = currString + s.charAt(j);		 
			   currCounter++; // assume to be equal
			   // LCS breaks but only update if bigger than current LCS length
 			   if (currString.substring(0,currString.length()-1).contains(Character.toString(s.charAt(j))) && currCounter >= memCounter) 
			   {			 
				   memString = currString.substring(0,currString.length()-1);
				  memCounter = currCounter-1;			  	   
				   currString = "";
				   i = j-2; // when LCS cuts off, start i at where j was at
				   //j++;			  					   
				   currCounter = 0;
				  break;		   
			   }
			   //(currCounter > memCounter) {
 			   // Found newest LCS but didn't break yet
			   else if (currCounter >= memCounter) {
				   memString = currString.substring(0,currString.length());
				   memCounter = currCounter;				   
			   }
			   
			   else {
				  // currCounter++;
				  // memString = currString;
				  // memCounter = currCounter;				   		
			   }
			   j++;
		   }
		   i++; 
		  }	   
	        }
	      System.out.println("memstring is: " + memString);			   
	     return memCounter;	   	     
	  }
	  
	  public static void main(String[] args) {
		  String word1 =  "abcabcbb"; // answer = 3
		  String word2  = "bbbbb"; // answer = 1
		  String word3 = "pwwkew"; // answer = 3
		  String word4 = "aa"; // answer = 1
		  String word5 = "au"; // answer = 2
		  String word6 = "aab"; // answer = 2
		  String word7 = "dvdf"; // answer = 3
		  
		  Solution func = new Solution(); // instantiate object to run method of class
		 
	//	System.out.println("LCS of " + "\"" + word1 + "\" " + "is: " + func.lengthOfLongestSubstring(word1));
	//	 System.out.println();			
		// System.out.println("LCS of " + "\"" + word2 + "\"" + " is: " + func.lengthOfLongestSubstring(word2));
		//  System.out.println();			
		// System.out.println("LCS of " + "\"" + word3 + "\"" + " is: " + func.lengthOfLongestSubstring(word3));
		//  System.out.println();		
		//System.out.println("LCS of " + "\"" +  word4 + "\"" + " is: " + func.lengthOfLongestSubstring(word4));
		//System.out.println();
		//System.out.println("LCS of " + "\"" + word5 + "\"" + " is: " + func.lengthOfLongestSubstring(word5));
		// System.out.println();		
		 System.out.println("LCS of " + "\"" + word6 + "\"" + " is: " + func.lengthOfLongestSubstring(word6));
		  System.out.println();	
		 System.out.println("LCS of " + "\"" + word7 + "\"" + " is: " + func.lengthOfLongestSubstring(word7));

}
}
