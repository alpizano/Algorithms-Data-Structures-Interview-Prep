
public class Solution {
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    	//copy all the elements
    	for(int i=0; i<=nums2.length-1;  i++) {
    		nums1[m] = nums2[i];
    		m++;
    	}
    	
    	//resort them 	 	
    	for (int i = 1; i <= nums1.length - 1; i++) {
			int temp_value = nums1[i];
			int gap = i;

			while (gap >= 1 && temp_value < nums1[gap - 1]) {
				nums1[gap] = nums1[gap - 1];
				gap--;

			}
			nums1[gap] = temp_value;
		}
		
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = new int[] {1,2,3,0,0,0}; // m = 3
		int[] nums2 = new int[] {2,5,6}; // n = 3
		//int[] nums1 = new int[] {0}; // m = 0
		//int[] nums2 = new int[] {1}; // n = 1
		
		Solution test = new Solution();
		
		test.merge(nums1, 3, nums2, 3);
		
		for(Integer i: nums1) {
			System.out.print(i);
		}
		
		}	
}
