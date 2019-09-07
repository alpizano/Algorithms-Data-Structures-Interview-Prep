import java.util.Arrays;

public class Solution {
	public static int maxSubArray(int[] nums) {

		// int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

		int max_sum = nums[0];
		int sum = 0;

		for (int i = 0; i <= nums.length - 1; i++) {
			sum = nums[i];
			if (sum > max_sum) {
				max_sum = sum;
			}

			for (int j = i + 1; j <= nums.length - 1; j++) {

				sum = sum + nums[j];

				if (sum > max_sum) {
					max_sum = sum;
				}
			}
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// int[] nums = new int[]{-2, 1};

		System.out.println(Solution.maxSubArray(nums));

	}
}
