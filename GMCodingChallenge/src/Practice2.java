import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			
		String line = "1,4,7,8;2,3,5,6";
				
		String[] values = line.split(";");
		
		String list1 = values[0];
		String list2 = values[1];
	
		String[] list1_arr = list1.split(",");
		String[] list2_arr = list2.split(",");
			
		int[] merge_arr = new int[list1_arr.length+list2_arr.length];
			
		int i =0;
		int l1= 0;
		int l2 = 0;
		while(i<=merge_arr.length-1) {
			if(l2 <= list2_arr.length-1 && l1 <= list1_arr.length-1  && Integer.parseInt(list1_arr[l1]) < Integer.parseInt(list2_arr[l2])) {
				merge_arr[i] = Integer.parseInt(list1_arr[l1]);
				l1++;
			}
			else if(l2 <= list2_arr.length-1 && l1 <= list1_arr.length-1  && Integer.parseInt(list2_arr[l2]) < Integer.parseInt(list1_arr[l1])) {
				merge_arr[i] = Integer.parseInt(list2_arr[l2]);
				l2++;
			}
			else {
				break;
			}
			i++;
		}	
		
		while(l1 <= list1_arr.length-1 || l2 <= list2_arr.length-1) {
			if(l1 <= list1_arr.length) {
				merge_arr[i] = Integer.parseInt(list1_arr[l1]);
				l1++;
			}
			else {
				merge_arr[i] = Integer.parseInt(list2_arr[l2]);
				l2++;
			}
			i++;
		}
	
		
		for(Integer p: merge_arr) {
			System.out.print(p + " ");
		}

}
}
