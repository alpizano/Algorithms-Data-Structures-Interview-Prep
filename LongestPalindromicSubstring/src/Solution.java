
public class Solution {
	
	  public String longestPalindrome(String s) {
		  
	
		  StringBuilder sb_running = new StringBuilder();
		  String sb_mem = ""; // LCS
		  String sb_temp = ""; // temp variable
		  String disp_str = "";
		  String disp_mem = "";
		  
		  int memCount = 0;
		  int tempCount = 0;
		  
		  if(s.length() == 1) {
			  return s;
		  }
		  
		  else if(s.length() == 2) {
			  sb_running.append(s.charAt(0));
			  sb_running.append(s.charAt(1));
			  if(sb_running.toString().equals(sb_running.reverse().toString())) {
				  return sb_running.reverse().toString();
			  }
			  else {
				  sb_running.reverse().toString();
				  return Character.toString(s.charAt(1));
			  }
		  }
		  
		  else {
			  
		  for(int i =0; i<=s.length()-1; i++) {
			  
			  sb_running.append(s.charAt(i));
			  
			  sb_temp = sb_running.toString();
			  disp_str = sb_running.toString();
		  
			  for(int j=i+1; j<=s.length()-1; j++) {
				  sb_running.append(s.charAt(j));
				  disp_str = sb_running.toString();

				  
				  // if palindrome and bigger than current longest, update
				  if(sb_running.toString().equals(sb_running.reverse().toString())) {
					  
					  sb_temp = sb_running.toString();
					 // tempCount = sb_running.length();
					
				  }
				  sb_running.reverse();
				  
				  if(sb_temp.length() > sb_mem.length()) {
					  sb_mem = sb_temp;
					  memCount = tempCount;
				  }
				  
			  }
			  sb_running.setLength(0);
			  			  
		  }							  
		  }
		  
		 return sb_mem;

	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "babad";
		String str2 = "cbbd";
		String str3 = "bb";
		String str4 = "abcda";
		String str5 = "abacab";
		String str6 = "kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyckqfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsgctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpfcdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyqueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveeemhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyaevoqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokjpggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd";

		
		Solution test = new Solution();
		
		System.out.println(test.longestPalindrome(str));
		System.out.println(test.longestPalindrome(str2));
		System.out.println(test.longestPalindrome(str3));
		System.out.println(test.longestPalindrome(str4));
		System.out.println(test.longestPalindrome(str5));
		System.out.println(test.longestPalindrome(str6));


	}

}
