public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0);
	        ListNode curr = dummyHead;
	        int carry = 0;
	        int sum = 0;
	        int x = 0;
	        int y = 0;
	       
	        ListNode q = l2;      
	        for(ListNode p = l1; p != null; p = p.next) {
	           if (p != null || q != null) 
	           {
	               x = p.val;
	                y = q.val;
	           }
	            else if (p == null || q == null)
	            {
	                 x = 0;
	                 y = 0;
	            }
	            
	            sum = x + y + carry;
	            
	            carry = sum/10; // sets carry to 1 or 0
	            curr.next = new ListNode(sum % 10);
	                curr = curr.next;
	            if(q != null) {
	                 q = q.next;
	            }
	        }
	        
	       if (carry > 0 ) {
	          curr.next = new ListNode(carry);
	       }
	        
	        return dummyHead.next;
	    }
	 public static void main (String[] args) {
		 System.out.println("Hello World");
	 }
	}