import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class Solution {
	
//	public List<String> subdomaininVisists(String[] cpdomains) {
//		List<String> list = new ArrayList<>();
//		
//		for(int i=0; i<=cpdomains.length-1; i++) {
//			list.add(cpdomains[i].split(" "));
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str_arr = new String[] {"9001 discuss.leetcode.com"};
		String[] str_arr2 = new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		
		Solution test = new Solution();
		
		List<String> list = new ArrayList<>();
		HashSet<String> set = new HashSet<>();

		
//		test.subdomaininVisists(str_arr);
		String[] split_control = new String[] {};
		String[] subdomain_control = new String[] {};
		String[] subdomain_control_padded = new String[3];
		String[] subdomain_compare_padded = new String[3];
		String[] split_compare  = new String[] {};
		String[] subdomain_compare  = new String[] {};
		int[] count_arr = new int[3];
		String level1 = " ";
		String level2 = " ";
		String level3 = " ";
		
		int count = 0;
		
		for(int i=0; i<=str_arr2.length-1; i++) {
			split_control = str_arr2[i].split("\\s+");	
			count_arr[0] = Integer.valueOf(split_control[0]);
			count_arr[1] = Integer.valueOf(split_control[0]);
			count_arr[2] = Integer.valueOf(split_control[0]);
			subdomain_control = split_control[1].split("\\.");	
			
			if(subdomain_control.length == 2) {
				subdomain_control_padded[0] = " ";
				subdomain_control_padded[1] = subdomain_control[0];
				subdomain_control_padded[2] = subdomain_control[1];
			}
			else {
				subdomain_control_padded = subdomain_control;
			}
			
			
			for(int j=0; j<=str_arr2.length-1; j++) {
				if(i != j) {
					split_compare = str_arr2[j].split("\\s+");	
					int domain_count_compare = Integer.valueOf(split_compare[0]);
					subdomain_compare = split_compare[1].split("\\.");
					
					if(subdomain_compare.length == 2) {
						subdomain_compare_padded[0] = " ";
						subdomain_compare_padded[1] = subdomain_compare[0];
						subdomain_compare_padded[2] = subdomain_compare[1];
					}
					else {
						subdomain_compare_padded = subdomain_compare;
					}
					
					
					// count .com (if exit first)
					if(subdomain_control_padded[2].equals(subdomain_compare_padded[2])) {
						count_arr[2] = count_arr[2] + domain_count_compare;
					//}
					if(subdomain_control_padded[2].equals(subdomain_compare_padded[2]) && subdomain_control_padded[1].equals(subdomain_compare_padded[1])) {
						count_arr[1] = count_arr[1] + domain_count_compare;

					}
					if(subdomain_control_padded[2].equals(subdomain_compare_padded[2]) && subdomain_control_padded[1].equals(subdomain_compare_padded[1]) && subdomain_control_padded[0].equals(subdomain_compare_padded[0])) {
						count_arr[0] = count_arr[0] + domain_count_compare;

					}
				}
			}
		} // end inner loop
			//list.add(String.valueOf(count_arr[2]) +" "+ subdomain_control_padded[2]);
			//list.add(String.valueOf(count_arr[1]) +" "+ subdomain_control_padded[1] + "."+ subdomain_control_padded[2]);
			//list.add(String.valueOf(count_arr[0]) +" "+ subdomain_control_padded[0] + "."+subdomain_control_padded[1]+ "."+ subdomain_control_padded[2]);
			
			set.add(String.valueOf(count_arr[2]) +" "+ subdomain_control_padded[2]);
			set.add(String.valueOf(count_arr[1]) +" "+ subdomain_control_padded[1] + "."+ subdomain_control_padded[2]);
			if(!subdomain_control_padded[0].equals(" ")){
			set.add(String.valueOf(count_arr[0]) +" "+ subdomain_control_padded[0] + "."+subdomain_control_padded[1]+ "."+ subdomain_control_padded[2]);
			}

	} // end outer loop

		for(String s: set) {
			list.add(s);
		}
		
		System.out.println(list);
		
		
		
}
}
