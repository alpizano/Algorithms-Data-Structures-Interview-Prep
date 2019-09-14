
public class Solution {

	public String[] reorderLogFiles(String[] logs) {
		String[] letter_logs = new String[100];
		String[] digit_logs = new String[100];

		int let_count = 0;
		int dig_count = 0;

		for (int i = 0; i <= logs.length - 1; i++) {
			String[] words_i = logs[i].split(" ");
			if (Character.isLetter(words_i[1].charAt(0))) {
				letter_logs[let_count] = logs[i];
				let_count++;
			}
			if (Character.isDigit(words_i[1].charAt(0))) {
				digit_logs[dig_count] = logs[i];
				dig_count++;
			}
		}

		String[] letter_logs2 = new String[let_count];
		String[] digit_logs2 = new String[dig_count];

		for (int i = 0; i <= letter_logs2.length - 1; i++) {
			letter_logs2[i] = letter_logs[i];
		}

		for (int i = 0; i <= digit_logs2.length - 1; i++) {
			digit_logs2[i] = digit_logs[i];
		}

		String temp = "";
		String[] words_i = new String[] {};
		int min = 0;
		int tie_count = 0;

		for (int i = 0; i <= letter_logs2.length - 1; i++) {
			min = i;

			for (int j = i + 1; j <= letter_logs2.length - 1; j++) {
				String[] words_j = letter_logs2[j].split(" ");
				words_i = letter_logs2[min].split(" ");

				int k = 1;
				while (k <= words_j.length - 1 && k <= words_i.length - 1) {

					if (words_j[k].compareTo(words_i[k]) < 0) {
						min = j;

					} else if (words_j[k].compareTo(words_i[k]) == 0) {
						tie_count++;
					} else {
						break;
					}
					k++;
				}
				if (tie_count == words_j.length && tie_count == words_i.length) {
					if (words_j[0].compareTo(words_i[0]) < 0) {
						min = j;
					}
				}
				if (j == letter_logs2.length - 1 && min != i) {
					temp = letter_logs2[i];
					letter_logs2[i] = letter_logs2[min];
					letter_logs2[min] = temp;
				}
			}
		}

		String[] combined_arr = new String[let_count + dig_count];

		for (int i = 0; i <= letter_logs2.length - 1; i++) {
			combined_arr[i] = letter_logs2[i];
		}

		for (int i = 0; i <= digit_logs2.length - 1; i++) {
			combined_arr[let_count] = digit_logs2[i];
			let_count++;
		}

		return combined_arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[] logs = new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6",
		// "let2 own kit dig",
		// "let3 art zero" };

		// String[] logs = new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off
		// key dog","a8 act zoo","a2 act car"};

		String[] logs = new String[] { "8 fj dzz k", "5r 446 6 3", "63 gu psub", "5 ba iedrz", "6s 87979 5",
				"3r 587 01", "jc 3480612", "bb wsrd kp", "b aq cojj", "r5 6316 71" };

		Solution test = new Solution();

		String[] ret_arr = test.reorderLogFiles(logs);

		for (String s : ret_arr) {
			System.out.println(s);
		}
	}
}
