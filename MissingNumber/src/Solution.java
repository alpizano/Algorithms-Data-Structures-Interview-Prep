public class Solution {

	public int missingNumber(int[] nums) {

		int missing_index = 0;

		int[] test_arr = new int[nums.length + 1];

		for (int i = 0; i <= nums.length - 1; i++) {
			test_arr[nums[i]] = 1;
		}

		for (int i = 0; i <= test_arr.length - 1; i++) {
			if (test_arr[i] == 0) {
				missing_index = i;
			}
		}

		return missing_index;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] new_arr = new int[] { 3, 0, 1 };
		int[] new_arr2 = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		Solution test = new Solution();

		System.out.println(test.missingNumber(new_arr));
		System.out.println(test.missingNumber(new_arr2));

	}

}

