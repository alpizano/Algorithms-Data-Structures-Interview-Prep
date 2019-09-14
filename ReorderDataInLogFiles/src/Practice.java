
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		String[] logs = new String[] { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig",
		"let3 art zero" };
		String[] words = logs[1].split(" ");
		
		for(int i =1; i<=words.length-1; i++) {
			sb.append(words[i]);
			//System.out.println(words[i]);
		}
		
		for(int i=0; i<4; i++) {
			sb2.append("H");
		}
		
		System.out.println(sb);
		System.out.println(sb2.compareTo(sb));

	}

}
