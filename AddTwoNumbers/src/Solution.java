/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0);
	        ListNode curr = dummyHead;
	        int carry = 0;
	        int sum = 0;
	        int x = 0;
	        int y = 0;
	       
	        ListNode q = l2;   
            ListNode p = l1;
         while(p != null || q != null) {
	           if (p != null) {
                    x = p.val;
               }               
                if (q != null) {
	                y = q.val;
	           }
	            if (p == null) {
                    x = 0;
                }    
                if( q == null) {  
	                 y = 0;
	            }
	            
	            sum = x + y + carry;
	            
	            carry = sum/10; // sets carry to 1 or 0
	            curr.next = new ListNode(sum % 10);
	            curr = curr.next;
                
	            if(q != null) {
	                 q = q.next;
	            }
             
             if(p != null ) {
                 p = p.next;
             }
	        }
	        
	       if (carry > 0 ) {
	          curr.next = new ListNode(carry);
	       }
	        
	        return dummyHead.next;
	    }
	
	}