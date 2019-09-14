
public class Solution {
	
	// public String[] reorderLogFiles(String[] logs) {
	        //for(String s:logs) {
	       // 	System.out.println(s);
	      //  }
	  //  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] logs = new String [] {"dig1 8 1 5 1","let1 art can",
				"dig2 3 6","let2 own kit dig","let3 art zero"};
		
		int num1 = 8;
		Integer.valueOf(num1);
		
		System.out.println(Integer.valueOf(num1).getClass().getSimpleName());
		
		  for(String s:logs) {
	        	System.out.println(s);
	        }
		  String[] words1 = logs[1].split(" ");
		  String[] words3 = logs[3].split(" ");
		  
		  char[] c0 = logs[0].toCharArray();
		  char[] c3 = logs[3].toCharArray();
		  
		  System.out.println(c0[4]);
		  System.out.println(c3[4]);
		  
		  System.out.println(words1[1]);
		  System.out.println(words3[1]);
		  
		  System.out.println(words3[1].compareTo(words1[1]));
	
	
	      for(int i=0; i<logs.length-1; i++) {
	    	  
	      }
	
	}
}
