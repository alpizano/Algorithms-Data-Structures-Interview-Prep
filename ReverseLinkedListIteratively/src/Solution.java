/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *     val = x; 
 *     }
 * }
 */
public class Solution {

	public ListNode reverseList(ListNode head) {

		ListNode dummyList = null;
		ListNode temp = null;

		for (ListNode cursor = head; cursor != null; cursor = cursor.next) {
			temp = new ListNode(cursor.val);
			temp.next = dummyList;
			dummyList = temp;

		}

		return dummyList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution test = new Solution();
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);
		
		ListNode tList1 = null;
		
		ListNode tList2 = tList1;
		
		System.out.println(tList2.val);
		
		System.out.println("Head value is: " + list1.val);

		System.out.println("Original List:");
		for(ListNode cursor=list1; cursor != null; cursor=cursor.next) {
		System.out.print(cursor.val + " ");
		}
		
		System.out.println();
		System.out.println("Reversed List:");
		ListNode dummyList = test.reverseList(list1);
		for (ListNode cursor = dummyList; cursor != null; cursor = cursor.next) {
			System.out.print(cursor.val + " ");
		}

	}

}
