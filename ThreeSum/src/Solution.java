import java.util.List;
import java.util.ArrayList;

import java.util.HashSet;

public class Solution {
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 
		 HashSet<Integer> set = new HashSet<>();
		 List<List<Integer>> list = new ArrayList<>();
		 
		 for(int i =0; i<=nums.length-1; i++) {
			 
			 for(int j=1; j<=nums.length-1; j++) {
				 
				 for(int k=2; k<=nums.length-1; k++) {
					 if(k != j && j != i && i != k && (nums[i] + nums[j] + nums[k] == 0)) {
						 List<Integer> triplet = new ArrayList<>();
						 if(!set.contains(nums[i])|| !set.contains(nums[j]) || !set.contains(nums[k])) {
						 set.add(nums[i]);
						 set.add(nums[j]);
						 set.add(nums[k]);
						 triplet.add(nums[i]);
						 triplet.add(nums[j]);
						 triplet.add(nums[k]);
						 list.add(triplet);
						 }
					 }
					 
				 }
			 }
		}
	        
	        return list;
	    }
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		Solution test = new Solution();
		
		System.out.println(test.threeSum(nums));
	}

}
