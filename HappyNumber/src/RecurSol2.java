import java.util.HashSet;

public class RecurSol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<>();

		set.add(13);
		set.add(15);
		set.add(17);

		if (!set.contains(14)) {
			System.out.println("Fuck you");
		}

		System.out.println(set);

	}

}
