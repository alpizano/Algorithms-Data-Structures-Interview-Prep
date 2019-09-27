import java.util.HashSet;

public class Solution {
	public int numJewelsInStones(String J,String S) {
HashSet<String> set = new HashSet<>();

		int count = 0;
		
		for(int i=0; i<=J.length()-1; i++) {
			set.add(String.valueOf(J.charAt(i)));
		}
		
		for(int i=0; i<=S.length()-1; i++) {
			if(set.contains(String.valueOf(S.charAt(i)))) {
				count ++;
			}
		}

		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String J = "aA";
		String S = "aAAbbbb";
		String J2 = "z";
		String S2 = "ZZ";
		
		Solution test = new Solution();
		
		System.out.println(test.numJewelsInStones(J, S));
		System.out.println(test.numJewelsInStones(J2, S2));

		
	}

}
