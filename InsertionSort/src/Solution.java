// Insertion Sort

public class Solution {

	public int[] sort(int[] num) {

		for (int i = 1; i <= num.length - 1; i++) {
			int temp_value = num[i];
			int gap = i;

			while (gap >= 1 && temp_value < num[gap - 1]) {
				num[gap] = num[gap - 1];
				gap--;

			}
			num[gap] = temp_value;
		}

		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num_arr = new int[] { 4, 2, 7, 1, 3 };

		Solution test1 = new Solution();
		int[] ret_arr = test1.sort(num_arr);

		for (int i : ret_arr) {
			System.out.print(i);
		}
	}
}
