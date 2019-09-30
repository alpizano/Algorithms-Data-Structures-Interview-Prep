
public class Solution {

	public int climbStairs(int n) {
		int[] int_arr = new int[n+1];
		int sum = 0;
		
		for(int i=0; i<=int_arr.length-1; i++) {
			if(i == 0) {
				int_arr[0] = 0;
			}
			else if(i == 1 )  {
				int_arr[1] =1;
			}
			else {
				int_arr[i] = int_arr[i-1] + int_arr[i-2]; 
			}
			sum = sum + int_arr[i];

			// System.out.print(int_arr[i]+ " ");
			// System.out.println(sum);
		}
		return int_arr[int_arr.length-1] + int_arr[int_arr.length-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		Solution test = new Solution();
		
		System.out.println(test.climbStairs(n));
		
		
		}
		
	}


