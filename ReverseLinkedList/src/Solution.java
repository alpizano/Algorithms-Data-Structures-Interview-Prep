import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	
public ListNode reverseList(ListNode head) {
	
	Stack<Integer> intStack = new Stack<>();
	
	for(ListNode cursor=head; cursor != null; cursor=cursor.next) {
		intStack.push(cursor.val);
	}
	
	
	
	return head;
	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
