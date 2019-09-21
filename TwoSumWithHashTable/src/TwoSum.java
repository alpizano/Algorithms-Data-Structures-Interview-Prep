import java.util.HashMap; // import the HashMap class
import java.util.Map;

public class TwoSum {
	
	//public static void twoSum(int[] nums, int target) {
	public static int[] twoSum(int[] nums, int target) {
		
		  Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
	}


	public static void main(String args[]) {

    //int[] newArr = new int[] {5, 23, 1, 99, 7, 69};
    int[] newArr = new int[] {3,2,4};
   
    
    int[] retArr = TwoSum.twoSum(newArr,6);
    
    for(int i : retArr) {
    	System.out.println(i);
    }
    
	}

}
