import java.util.HashSet;

public class Solution {

	public boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<>();

		int orig = n;
		int sum = 0;

		while (!set.contains(n)) {
			sum = 0;

			if (n == 1) {
				return true;
			}

			while (n > 0) {
				sum = sum + (int) Math.pow(n % 10, 2);
				n = n / 10;
			}
			System.out.println(sum);
			n = sum;
			set.add(sum);
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 19;
		// int n = 2;
		Solution test = new Solution();

		System.out.println(test.isHappy(n));
	}

}
