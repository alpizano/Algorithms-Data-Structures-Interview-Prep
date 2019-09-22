import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> doublet = new ArrayList<>();
		
		doublet.add(3);
		doublet.add(5);
		
		for(Integer i: doublet) {
			System.out.println(i);
		}
		
		System.out.println(doublet);
		
		Arrays.toString(doublet.toArray()).replace("[", "(").replace("]", ")");
		System.out.println(doublet);

	}

}
