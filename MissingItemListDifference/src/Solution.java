import java.util.HashMap;

public class Solution {

	public static int find_missing(int[] num_arr1, int[] num_arr2) {

		HashMap<Integer,Integer> int_hashmap = new HashMap<>();
			
		for (int i = 0; i <= num_arr2.length - 1; i++) {
			int_hashmap.put(num_arr2[i], i);
		}
		
		int ans=0;
		
		for(int j=0; j<= num_arr1.length -1; j++ ) {
			if(!int_hashmap.containsKey(num_arr1[j])) {
				ans = num_arr1[j];
				break;
			}
		}
	
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num_arr1 = new int[] { 4, 12, 9, 5, 6 };
		int[] num_arr2 = new int[] { 4, 9, 12, 6 };

		System.out.println(Solution.find_missing(num_arr1, num_arr2));

	}
}
