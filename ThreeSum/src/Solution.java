import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 
		 HashSet<List<Integer>> set = new HashSet<>();	
		 List<List<Integer>> list = new ArrayList<>();
		 
		 
		 
		 for(int i =0; i<=nums.length-1; i++) {
			 
			 for(int j=1; j<=nums.length-1; j++) {
				 
				 for(int k=2; k<=nums.length-1; k++) {
					 if(k != j && j != i && i != k && (nums[i] + nums[j] + nums[k] == 0)) {
						 
						 List<Integer> triplet = new ArrayList<>();
						 
						 triplet.add(nums[i]);
						 triplet.add(nums[j]);
						 triplet.add(nums[k]); 
						 triplet.sort(null);
						 
						 if(!set.contains(triplet)) {
							 
						 set.add(triplet);
						 
						 System.out.println("Set looks like: " + set);						 
						 list.add(triplet);
						 System.out.println("List looks like: " + list);
						 
						 }
						 
							 
						 
						 
					 }
					 
				 }
			 }
		}
	        
	        return list;
	    }
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		//int[] nums2 = new int[] {2,-8,8,6,-14,-12,11,-10,13,14,7,3,10,-13,3,-15,7,3,-11,-8,4,5,9,11,7,1,3,13,14,-13,3,-6,-6,-12,-15,-12,-9,3,-15,-11,-6,-1,0,11,2,-12,3,-6,6,0,-6,-12,-10,-12,6,5,-4,-5,-5,-4,-11,13,5,-2,-13,-3,-7,-15,8,-15,12,-13,0,-3,6,9,-8,-6,10,5,9,-11,0,7,-15,-8,-3,-4,-6,7,7,-2,-2,-11,3,0,-6,12,0,-13,4,-3,11,-11,1,2,13,8,4,9,-1,-2,5,14,12,5,13,-6,-13,-8,9,1,5,-8,-2,-6,-1};
		Solution test = new Solution();
		
		System.out.println(test.threeSum(nums));
		//System.out.println(test.threeSum(nums2));
	}

}
