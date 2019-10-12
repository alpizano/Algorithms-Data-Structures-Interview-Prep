
public class Solution {
	public String addBinary(String a, String b) {

		if (a.length() != b.length()) {
			if (a.length() < b.length()) {
				int padding = b.length() - a.length();
				for (int i = 0; i <= padding - 1; i++) {
					a = "0" + a;
				}
			} else {
				int padding = a.length() - b.length();
				for (int i = 0; i <= padding - 1; i++) {
					b = "0" + b;
				}
			}
		}

		String[] arrA = a.split("");
		String[] arrB = b.split("");
		int carry = 0;
		String ans = "";

		int i = arrA.length - 1;
		int j = arrB.length - 1;

		while (i >= 0 && j >= 0) {
			if (arrA[i].equals("0") && arrB[j].equals("0")) {
				int temp = 0;
				temp = carry + temp;
				ans = String.valueOf(temp) + ans;
				carry = 0;
			} else if (arrA[i].equals("1") && arrB[j].equals("0") || arrA[i].equals("0") && arrB[j].equals("1")) {

				if (carry == 1) {
					int temp = 1;
					temp = 0;
					ans = String.valueOf(temp) + ans;
					carry = 1;
				} else {
					int temp = 1;
					temp = carry + temp;
					ans = String.valueOf(temp) + ans;
					carry = 0;
				}

			} else if (arrA[i].equals("1") && arrB[j].equals("1")) {
				int temp = 0;
				temp = carry + temp;
				ans = String.valueOf(temp) + ans;
				carry = 1;
			}
			i--;
			j--;
		}

		if (carry == 1) {
			ans = "1" + ans;
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11";
		String b = "1";

		String a1 = "1010";
		String b1 = "1011";

		Solution test = new Solution();

		System.out.println(test.addBinary(a, b));
		System.out.println(test.addBinary(a1, b1));

	}

}
