
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int num = Integer.parseInteger(line);
    	int grams = 9;
    	int robot_clone = 1;
    	int days =0;
    	
    	for(int i=0; i<grams; i++) {
    		
    		
    		System.out.print(robot_clone + " " + "on day: " + days);
    		System.out.println();
    		robot_clone = robot_clone + 1;
    		days += days;
    		days++;
    		if(robot_clone > grams) {
    			break;
    		}
    		
    		
    	}
    	System.out.println();
    	System.out.println(days);

	}

}
