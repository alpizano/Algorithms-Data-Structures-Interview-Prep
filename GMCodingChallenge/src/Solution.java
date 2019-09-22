import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Solution {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    
    String line;
    
    while ((line = in.readLine()) != null) {
    	
     // int num = Integer.parseInteger(line);
    	int num = 9;
    	int robot = 1;
    	
    	for(int i=0; i<9; i++) {
    		robot += robot;
    	}
      System.out.println(line);
    }
  }
}