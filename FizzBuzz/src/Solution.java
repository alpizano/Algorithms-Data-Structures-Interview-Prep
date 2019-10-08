import java.util.List;
import java.util.ArrayList;


public class Solution {
	public List<String> fizzBuzz(int n) {
		List<String> str_list = new ArrayList<>();
		
		
		for(int i =1 ; i<= n; i++) {
			if(i % 3 == 0 && i %5 != 0) {
				str_list.add("Fizz");
			}
			else if(i % 5 == 0 && i%3 != 0) {
				str_list.add("Buzz");
			}
			else if(i %3 == 0 && i%5 ==0) {
				str_list.add("FizzBuzz");
			}
			else {
				str_list.add(String.valueOf(i));
			}
		}
		
		return str_list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 15;
		
		Solution test = new Solution();
		
		System.out.println(test.fizzBuzz(n));
		
		

	}

}
