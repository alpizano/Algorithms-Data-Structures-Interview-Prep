
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str_arr = new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		
		//String[] first_split = new String[] {};
		
		String[]  first_split = str_arr[0].split("\\s+");
		
		String[] blah = first_split[1].split("\\.");
		
		System.out.println(first_split.length);
		
		System.out.println(first_split[0]);
		System.out.println(first_split[1]);
		
		System.out.println(blah.length);

		
		
		
		
		//for(String s: first_split) {
		//	System.out.println(s);
		//}
		
		
	}

}
