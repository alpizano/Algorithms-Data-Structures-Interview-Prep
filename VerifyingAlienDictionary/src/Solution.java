import java.util.HashMap;

public class Solution {
	
public boolean isAlienSorted(String[] words, String order) {
	Map<String,Integer> map = new HashMap<>();

	for(int i=0; i<=order.length()-1 ; i++) {
	map.put(String.valueOf(order.charAt(i)), i);

	}


	while(i != words.length() || j != words.length()-1) {

	}

	// for(int i=0; i<=words.length-1; i++) {
	// for(int j=i+1; j<=words.length-1; j++) {
	// if(!(map.get(String.valueOf(words[i].charAt(0))) < map.get(String.valueOf(words[j].charAt(0))))) {
	// return false;
	// }
	//
	//
	// }
	// }

	return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		String[] words = new String[] {"hello","leetcode"};
		String order2 = "worldabcefghijkmnpqstuvxyz";

		String[] words2 = new String[] {"word","world","row"};

		Solution test = new Solution();

		System.out.println(test.isAlienSorted(words, order));
		System.out.println(test.isAlienSorted(words2, order2));
		
		

	}

}
