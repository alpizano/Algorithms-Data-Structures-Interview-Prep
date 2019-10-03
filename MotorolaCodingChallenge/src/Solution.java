import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> str_list1 = Arrays.asList("listen");
		List<String> str_list2 = Arrays.asList("silent");
		
		Collections.sort(str_list1);
		Collections.sort(str_list2);
		

		System.out.println(str_list1.toString().equals(str_list2.toString()));
		
		
		
	}

}
