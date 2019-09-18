
public class Practice2 {
	
	public static int binToDec(String binary) {
		
		int num = Integer.parseInt(binary); // convert string to int
		int sum = 0;
		int i = 0;
		
		while(num > 0) {
			// take last digit
			if(num % 10 == 1) { 
				sum = sum + (num%10)*(int)Math.pow(2, i);
			}

			
			num= num / 10; // increment
			i++;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "110011,1010";
		String[] values = input.split(",");
		
		String num1 = "110011"; // 110011 = 51
		String num2 = "1010"; // 1010 = 10

	    System.out.println(Practice2.binToDec(num2));

	}

}
