import java.util.Stack;
import java.util.Iterator;

public class Solution {
	
	public static int find_missing(int[] num_arr1, int[] num_arr2) {
		
		//HashSet<Integer> int_hash = new HashSet<>();
		Stack<Integer> int_stack = new Stack<Integer>();
		
	
		for(int i=0; i<num_arr1.length-1; i++) {
			int_stack.push(num_arr1[i]);
		}
		
		int j = 0;
		
		Iterator<Integer> it = int_stack.iterator();
		
		// Need to use iterators method for removing, int_stack.pop() causes ConcurrentModificationException, because you are iterating through stack but trying to modify it as you iterate through it
		while (it.hasNext()) {
			Integer val = it.next();
			if(val == num_arr2[j]) {
				it.remove();
			}
		}
		

		
		
		
		return int_stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num_arr1 = new int[] {4,12,9,5,6};
		int[] num_arr2 = new int[] {4,9,12,6};
		
		
		System.out.println(Solution.find_missing(num_arr1,num_arr2));
		

		

	}

}
