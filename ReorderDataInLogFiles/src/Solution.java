
public class Solution {

	public String[] reorderLogFiles(String[] logs) {

		String[] letter_logs = new String[] {};
		String[] digit_logs = new String[] {};
		String[] words_i = new String[] {};
		String[] words_k = new String[] {};
		int let_count = 1;
		int let_start = 0;
		int let_copy_start = 0;
		int dig_count = 1;
		int dig_start = 0;
		int dig_copy_start = 0;

		// Creating separate arrays for digit_logs and letter_logs
		for (int i = 0; i <= logs.length - 1; i++) {
			words_i = logs[i].split(" ");
			if (Character.isLetter(words_i[1].charAt(0))) {
				letter_logs = new String[let_count];
				letter_logs[let_start] = logs[i];
				let_start++;
				if (let_count > 1) {
					for (int k = 0; let_copy_start < letter_logs.length - 1; k++) {
						words_k = logs[k].split(" ");
						if (Character.isLetter(words_k[1].charAt(0))) {
							letter_logs[let_copy_start] = logs[k];
							let_copy_start++;
						}
					}
				}
				let_copy_start = 0;
				let_count++;
			}
			if (Character.isDigit(words_i[1].charAt(0))) {
				digit_logs = new String[dig_count];
				digit_logs[dig_start] = logs[i];
				dig_start++;
				if (dig_count > 1) {
					for (int k = 0; dig_copy_start < digit_logs.length - 1; k++) {
						words_k = logs[k].split(" ");
						if (Character.isDigit(words_k[1].charAt(0))) {
							digit_logs[dig_copy_start] = logs[k];
							dig_copy_start++;
						}
					}
				}
				dig_copy_start = 0;
				dig_count++;
			}
		}

		String temp = "";
		int min = 0;
		int tie_count = 0;

		// Selection Sort algorithm
		for (int i = 0; i <= letter_logs.length - 1; i++) {
			min = i;
			for (int j = i + 1; j <= letter_logs.length - 1; j++) {
				String[] words_j = letter_logs[j].split(" ");
				words_i = letter_logs[min].split(" ");

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
				if (j == letter_logs.length - 1 && min != i) {
					temp = letter_logs[i];
					letter_logs[i] = letter_logs[min];
					letter_logs[min] = temp;
				}
			}
		}

		// Initializing new combined array that will be returned
		String[] combined_arr = new String[letter_logs.length + digit_logs.length];

		// Copying over letter_logs and digit_logs into the new combined array
		int j = 0;
		for (int i = 0; i <= combined_arr.length - 1; i++) {
			if (i <= letter_logs.length - 1) {
				combined_arr[i] = letter_logs[i];
			}

			if (i > letter_logs.length - 1) {
				combined_arr[i] = digit_logs[j];
				j++;
			}
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
