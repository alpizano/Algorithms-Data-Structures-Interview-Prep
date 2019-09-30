
public class Solution {

	public static int convertDigit(String s) {
		if (s.equals("I")) {
			return 1;
		} else if (s.equals("V")) {
			return 5;
		} else if (s.equals("X")) {
			return 10;
		} else if (s.equals("L")) {
			return 50;
		} else if (s.equals("C")) {
			return 100;
		} else if (s.equals("D")) {
			return 500;
		} else {
			return 1000;
		}
	}

	public int romanToInt(String s) {
		int sum = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			if (i < s.length() - 1 && convertDigit(String.valueOf(s.charAt(i))) == 1
					&& (convertDigit(String.valueOf(s.charAt(i + 1))) == 5
							|| convertDigit(String.valueOf(s.charAt(i + 1))) == 10)) {
				sum = sum + (convertDigit(String.valueOf(s.charAt(i + 1)))
						- convertDigit(String.valueOf(s.charAt(i))));
				i++;
			} else if (i < s.length() - 1 && convertDigit(String.valueOf(s.charAt(i))) == 10
					&& (convertDigit(String.valueOf(s.charAt(i + 1))) == 50
							|| convertDigit(String.valueOf(s.charAt(i + 1))) == 100)) {
				sum = sum + (convertDigit(String.valueOf(s.charAt(i + 1)))
						- convertDigit(String.valueOf(s.charAt(i))));
				i++;
			} else if (i < s.length() - 1 && convertDigit(String.valueOf(s.charAt(i))) == 100
					&& (convertDigit(String.valueOf(s.charAt(i + 1))) == 500
							|| convertDigit(String.valueOf(s.charAt(i + 1))) == 1000)) {
				sum = sum + (convertDigit(String.valueOf(s.charAt(i + 1)))
						- convertDigit(String.valueOf(s.charAt(i))));
				i++;
			} else {
				sum = sum + Solution.convertDigit(String.valueOf(s.charAt(i)));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		String test0 = "III";
		String test1 = "IV";
		String test2 = "IX";
		String test3 = "LVIII";
		String test4 = "MCMXCIV";

		Solution sol = new Solution();
		System.out.println(sol.romanToInt(test0));
		System.out.println(sol.romanToInt(test1));
		System.out.println(sol.romanToInt(test2));
		System.out.println(sol.romanToInt(test3));
		System.out.println(sol.romanToInt(test4));
	}
}
