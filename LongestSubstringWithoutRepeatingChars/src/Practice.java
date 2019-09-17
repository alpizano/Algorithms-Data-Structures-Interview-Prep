
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("c");
		sb.append("o");
		sb.append("w");
		
		System.out.println(sb.length());
		
		//System.out.println(sb);
		//System.out.println(sb.reverse());
		
		// "cow"
		
		// "woc"
		
		//if(sb.reverse().toString().equals(sb.toString())) {
			//System.out.println("Palindrome");
		//}		
		//else {
			//System.out.println("Not Palindrome");
		//}
		
		if(sb.reverse().toString().equals("woc")) {
			System.out.println("You are gay");
		}
		sb.reverse();
		System.out.println(sb.toString());
	}

}
