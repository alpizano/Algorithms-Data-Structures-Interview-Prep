import java.util.HashMap;
import java.util.Map;

public class Solution {

	public boolean isAlienSorted(String[] words, String order) {
		Map<String, Integer> map = new HashMap<>();
		
		boolean sorted = true;

		for (int i = 0; i <= order.length() - 1; i++) {
			map.put(String.valueOf(order.charAt(i)), i);

		}

		int i = 0;
		int match_count =0;

		for (int word_count = 0; word_count+1 <= words.length - 1; word_count++) {
			while (i <= words[word_count].length() - 1 && i <= words[word_count+1].length() - 1) {
				if (map.get(String.valueOf(words[word_count].charAt(i))) < map.get(String.valueOf(words[word_count + 1].charAt(i)))) {
					i = 0;
					break;
				}
				else if(map.get(String.valueOf(words[word_count].charAt(i))) > map.get(String.valueOf(words[word_count + 1].charAt(i)))) {
					//sorted = false;
					return sorted = false;
				}
				else {
					match_count++;
					if(match_count == words[word_count].length() || match_count == words[word_count+1].length()) {
						if(words[word_count].length()-1 > words[word_count+1].length()-1) {
							return sorted = false;
						}
//						else {
//							return sorted = true;
//						}
						
					}
				}

				i++;
			}
		}


	return sorted;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		String[] words = new String[] {"hello","leetcode"};
		
		String order2 = "worldabcefghijkmnpqstuvxyz";
		String[] words2 = new String[] {"word","world","row"};
		
		String order3= "abcdefghijklmnopqrstuvwxyz";
		String[] words3 = new String[] {"apple","app"};

		Solution test = new Solution();

		System.out.println(test.isAlienSorted(words, order));
		System.out.println(test.isAlienSorted(words2, order2));
		System.out.println(test.isAlienSorted(words3, order3));
		
		

	}

}
