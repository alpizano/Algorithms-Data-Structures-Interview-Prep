import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { 
 *     val = x;
 *      }
 * }
 */
public class Solution {

	public boolean isPalindrome(ListNode head) {
		
		Stack<Integer> intStack = new Stack<>();
		boolean palindrome = true;
		
		for(ListNode cursor=head; cursor != null; cursor=cursor.next) {
			intStack.push(cursor.val);
			
		}
		
		for(ListNode cursor=head; cursor != null; cursor=cursor.next) {
			if( cursor.val != intStack.pop()) {
				palindrome = false;
			}
		}
		
		return palindrome;

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode list = new ListNode(1);	
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(1);	
		list2.next = new ListNode(2);
		list2.next.next = new ListNode(2);
		list2.next.next.next = new ListNode(1);
		
		//for(ListNode cursor=list; cursor != null; cursor=cursor.next) {
			//System.out.print(cursor.val);
		//}
		
		Solution test = new Solution();
		
		System.out.println(test.isPalindrome(list));
		System.out.println(test.isPalindrome(list2));
	}

}
