
public class Solution {
	
	public static int[] plusOne(int[] digits) {
		
		boolean hasCarry = true;
		int carry = 1;
		
		for(int i=digits.length-1; i>=0; i--) {	
			if(hasCarry == true && digits[i] < 9) {
				digits[i] = digits[i] + carry;
				hasCarry = false;
			}
			if(hasCarry == true && digits[i] == 9) {
				digits[i] = 0;
				if(i == 0 ) {
					int[] overflow = new int[digits.length+1];
					overflow[0] = 1;
					int p=0;
					for(int j=1; j<=overflow.length-1; j++) { 
						overflow[j] = digits[p];
						p++;
					}
					return overflow;
				}
			}

		}
		
		return digits;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] test1 = new int[]{1,2,3};
		int[] test2 = new int[]{4,3,2,1};
		int[] test3 = new int[]{1,2,9};
		int[] test4 = new int[]{1,9,9,9,9,9};
		int[] test5 = new int[]{9,9,9};
		
		for(int i=0; i<=test1.length-1; i++) {
			System.out.print(test1[i] + " ");
		}
		
		System.out.println();
		
		int[] ans1 = Solution.plusOne(test1);
		int[] ans2 = Solution.plusOne(test2);
		int[] ans3 = Solution.plusOne(test3);
		int[] ans4 = Solution.plusOne(test4);
		int[] ans5 = Solution.plusOne(test5);
		
		for(int i=0; i<=ans1.length-1; i++) {
			System.out.print(ans1[i] + " ");
		}
		System.out.println();

		for(int i=0; i<=ans2.length-1; i++) {
		System.out.print(ans2[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<=ans3.length-1; i++) {
			System.out.print(ans3[i] + " ");
	}
		System.out.println();

		for(int i=0; i<=ans4.length-1; i++) {
			System.out.print(ans4[i] + " ");
		}
		
		System.out.println();

		for(int i=0; i<=ans5.length-1; i++) {
			System.out.print(ans5[i] + " ");
		}

	}

}
