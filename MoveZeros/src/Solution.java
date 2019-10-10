
public class Solution {
	public void moveZeroes(int[] nums) {

		int j = 0;

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == 0) {
				j = i;
				while (j < nums.length - 1 && nums[j] == 0) {
					j++;
				}
				nums[i] = nums[j]; // shift the number to the right 1 spot to the left

				nums[j] = 0; // copy the 0 that was at nums[i] to the end

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] { 0, 1, 0, 3, 12 };
		int[] nums2 = new int[] { 2, 1 };
		int[] nums3 = new int[] { 1, 0, 0 };
		int[] nums4 = new int[] { 0, 1, 0 };
		int[] nums5 = new int[] { 0, 0, 3, 1, 12 };

		Solution test = new Solution();

		test.moveZeroes(nums1);
		test.moveZeroes(nums2);
		test.moveZeroes(nums3);
		test.moveZeroes(nums4);
		test.moveZeroes(nums5);

		for (Integer i : nums1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (Integer i : nums2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (Integer i : nums3) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (Integer i : nums4) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (Integer i : nums5) {
			System.out.print(i + " ");
		}

	}

}
