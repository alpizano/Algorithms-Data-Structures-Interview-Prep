import java.util.HashSet;

public class RecurSol {
	HashSet<Integer> set = new HashSet<>();

	public boolean isHappy(int n) {

		while (!set.contains(n)) {

			set.add(n);
			System.out.print(set);

			n = calcSum(n);

			if (n == 1) {
				return true;
			}
		}

		return false;
	}

	public int calcSum(int n) {
		int sum = 0;

		while (n > 0) {
			sum = sum + (n % 10) * (n % 10); // 9
			n = n / 10; // increment
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int n = 19;
		int n = 2;

		RecurSol test = new RecurSol();

		System.out.println(test.isHappy(n));

	}

}
