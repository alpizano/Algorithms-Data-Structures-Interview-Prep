class Practice {
    
   public int reverse(int x) {
	   int rev=0;
	    int rem=0;
     
       
       
      
        while(x!=0)
        {
          rem =x%10;
          rev = rev*10 +rem;
          x=x/10;
        }
          System.out.println(rev);
     
      
    return rev;
       

   }
   
   public static void main(String[] args) {
	  int x = 1534236469;
	   //int x = 1079;
	   
	   Practice test = new Practice();
	   
	   System.out.println(test.reverse(x));

   }
}