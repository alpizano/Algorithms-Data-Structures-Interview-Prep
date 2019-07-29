import java.util.HashMap; // import the HashMap class

public class TwoSum {
	
	//public static void twoSum(int[] nums, int target) {
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> hashSum = new HashMap<Integer,Integer>();
		int[] ans = new int[2];
		
		// iterate thru array and put values in hash map
		for (int i=0; i<nums.length; i++) {
			hashSum.put(nums[i],i); // value of array is key, index is value
		}
		
		for(Integer i : hashSum.keySet()) {
			Integer comp = target - i;		
			 
			Integer compIndex = hashSum.get(comp);
			//System.out.println("Test null: " + compIndex);
			if(hashSum.get(comp) != null) {
				ans[0] = hashSum.get(i);
				ans[1] = hashSum.get(comp);	
			}
			System.out.println("value is: " + i + " at index: " + hashSum.get(i) + ", complement: " + comp);
		}
		
		//System.out.println("--------------------------");
		//for(int i : nums) {
			//System.out.println(i);
		//}
		return ans;
	}


	public static void main(String args[]) {

    int[] newArr = new int[] {5, 23, 1, 99, 7, 69};
    int[] retArr = new int[6];
    
    retArr = TwoSum.twoSum(newArr,30);
    
    for(int i : retArr) {
    	System.out.println(i);
    }
    
	}

}
