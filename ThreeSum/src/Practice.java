import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<List<Integer>> set = new HashSet<>();
		HashSet<List<Integer>> set2 = new HashSet<>();
		
		 List<List<Integer>> list = new ArrayList<>();
		 
		 List<Integer> triplet = new ArrayList<>();
		 
		 triplet.add(-1);
		 triplet.add(-1);
		 triplet.add(2);
		 
		 set.add(triplet);
		 
		 List<Integer> triplet2 = new ArrayList<>();

		 
		 triplet2.add(-1);
		 triplet2.add(2);
		 triplet2.add(-1);
		 
		 set2.add(triplet2);
		 
		 System.out.println(set2);
		 
		 System.out.println("Before sorting:" + triplet2);
		 triplet2.sort(null);
		 System.out.println("After sorting:" + triplet2);
		 
		 if(set.contains(triplet2)) {
			 System.out.println("Yeah bud");
		 }
		 else {
			 System.out.println("Nah bud");
		 }
		 
		 System.out.println();
		 
		 if(triplet.equals(triplet2)) {
			 System.out.println("The triplets are equal!");
		 }
		 else {
			 System.out.println("Not equal!!!!");
		 }
		 
		 set.add(triplet2);
		 
		 System.out.println(set);
		 
		 set.contains(new ArrayList<>(Arrays.asList(-1,2,-1)));
		 
		 if(set.contains(new ArrayList<>(Arrays.asList(-1,2,-1)))) {
			System.out.println("Yes, it contains it!"); 
		 }
		 else {
			 System.out.println("No");
		 }
		 
		 if(set.containsAll(new HashSet<>(Arrays.asList(new ArrayList<>(Arrays.asList(-1,-1,2)))))) {
				System.out.println("Yes, it contains it!"); 
			 }
			 else {
				 System.out.println("No");
			 }
		 
	}

}
