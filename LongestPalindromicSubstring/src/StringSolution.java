
public class StringSolution {

	public static boolean palindromeCheck(String s) {
		boolean isPalindrome = true;

		if (s.length() % 2 == 0) {
			int j = s.length() - 1;
			for (int i = 0; j > i; i++) {
				if (s.charAt(i) != (s.charAt(j))) {
					return false;
				}
				j--;
			}

		} else {

			int j = s.length() - 1;
			for (int i = 0; j != i; i++) {
				if (s.charAt(i) != (s.charAt(j))) {
					return false;
				}
				j--;
			}

		}
		return isPalindrome;
	}

	public String longestPalindrome(String s) {
	String str_temp = "";
		String str_running = "";
		String str_mem = "";

		if (s.length() == 1) {
			return s;
		} else if (s.length() == 2) {
			if (StringSolution.palindromeCheck(s)) {
				return s;
			} else {
				return Character.toString(s.charAt(0));
			}
		} else {
			for (int i = 0; i <= s.length() - 1; i++) {
				str_running = str_running + Character.toString(s.charAt(i));
				if (i == 0) {
					str_mem = str_running;
				}
				for (int j = i + 1; j <= s.length() - 1; j++) {
					str_running = str_running + s.charAt(j);
					if (StringSolution.palindromeCheck(str_running)) {
						str_temp = str_running;
					}
					if (str_temp.length() > str_mem.length()) {
						str_mem = str_temp;
					}

				}
				str_running = "";
			}
		}
		return str_mem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "babad";
//		String str2 = "cbbd";
//		String str3 = "bb";
//		String str4 = "abcda";
//		String str5 = "abacab";
//		String str6 = "kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyckqfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsgctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpfcdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyqueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveeemhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyaevoqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokjpggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd";
		String str7 = "ac";
		String str8 = "whdqcudjpisufnrtsyupwtnnbsvfptrcgvobbjglmpynebblpigaflpbezjvjgbmofejyjssdhbgghgrhzuplbeptpaecfdanhlylgusptlgobkqnulxvnwuzwauewcplnvcwowmbxxnhsdmgxtvbfgnuqdpxennqglgmspbagvmjcmzmbsuacxlqfxjggrwsnbblnnwisvmpwwhomyjylbtedzrptejjsaiqzprnadkjxeqfdpkddmbzokkegtypxaafodjdwirynzurzkjzrkufsokhcdkajwmqvhcbzcnysrbsfxhfvtodqabvbuosxtonbpmgoemcgkudandrioncjigbyizekiakmrfjvezuzddjxqyevyenuebfwugqelxwpirsoyixowcmtgosuggrkdciehktojageynqkazsqxraimeopcsjxcdtzhlbvtlvzytgblwkmbfwmggrkpioeofkrmfdgfwknrbaimhefpzckrzwdvddhdqujffwvtvfyjlimkljrsnnhudyejcrtrwvtsbkxaplchgbikscfcbhovlepdojmqybzhbiionyjxqsmquehkhzdiawfxunguhqhkxqdiiwsbuhosebxrpcstpklukjcsnnzpbylzaoyrmyjatuovmaqiwfdfwyhugbeehdzeozdrvcvghekusiahfxhlzclhbegdnvkzeoafodnqbtanfwixjzirnoaiqamjgkcapeopbzbgtxsjhqurbpbuduqjziznblrhxbydxsmtjdfeepntijqpkuwmqezkhnkwbvwgnkxmkyhlbfuwaslmjzlhocsgtoujabbexvxweigplmlewumcone";
		
		StringSolution test = new StringSolution();
		
//		System.out.println(test.longestPalindrome(str));
//		System.out.println(test.longestPalindrome(str2));
//		System.out.println(test.longestPalindrome(str3));
//		System.out.println(test.longestPalindrome(str4));
//		System.out.println(test.longestPalindrome(str5));
//		System.out.println(test.longestPalindrome(str6));
		System.out.println(test.longestPalindrome(str7));
		System.out.println(test.longestPalindrome(str8));
		

	}	
}
