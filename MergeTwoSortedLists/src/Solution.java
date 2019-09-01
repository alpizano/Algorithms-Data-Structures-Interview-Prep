/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     
 *     ListNode(int x) { 
 *     val = x;
 *      }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// l1 -> 1 -> 2 -> 4
		// l2 -> 1 -> 3 -> 4
		// newList -> 1 -> 1 -> 2 -> 3 -> 4 -> 4

		// System.out.println(l1.val);
		// System.out.println(l2.val);

		ListNode newList = new ListNode(0);
		ListNode sNode = newList;

		ListNode c2 = l2;

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		// for(ListNode cursor1=l1; cursor1 != null; cursor1=cursor1.next) {
		// while( cursor2 != null) {
		// if(cursor1.val < cursor2.val) {
		// sNode.next = new ListNode(cursor1.val);
		// sNode.next.next = new ListNode(cursor2.val);
		// }
		// else if(cursor2.val < cursor1.val) {
		// sNode.next = new ListNode(cursor2.val);
		// sNode.next.next = new ListNode(cursor1.val);
		// }
		// else {
		// sNode.next = new ListNode(cursor1.val);
		// sNode.next.next = new ListNode(cursor2.val);
		// }
		// sNode = sNode.next.next;
		// cursor2=cursor2.next;
		// }
		// }

		ListNode c1 = l1;
		//for (ListNode c1 = l1; c1 != null; c1 = c1.next) {
		while(c1 != null) {
			
			while (c2 != null) {
				if (c1 != null && c1.val < c2.val) {
					sNode.next = new ListNode(c1.val);
					sNode = sNode.next;
					c1 = c1.next;				
				} 
				else if (c1 != null && c2.val < c1.val) {
					sNode.next = new ListNode(c2.val);
					sNode = sNode.next;
					c2 = c2.next;					
				} 	
				else if(c1 != null && c1.val == c2.val) { 
					sNode.next = new ListNode(c1.val);
					sNode.next.next = new ListNode(c2.val);
					sNode = sNode.next.next;
					c1 = c1.next;
					c2 = c2.next;				
				}
				else if(c1 == null) {
					sNode.next = new ListNode(c2.val);
					c2 = c2.next;
				}
			}
				
			if(c1 != null) {
				sNode.next = new ListNode(c1.val);
				sNode = sNode.next;
				c1 = c1.next;
			}
		}

		return newList.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(1);
		
		ListNode l4 = null;

		ListNode l5 = new ListNode(-10);
		l5.next = new ListNode(-10);
		l5.next.next = new ListNode(-9);
		l5.next.next.next = new ListNode(-4);
		l5.next.next.next.next = new ListNode(1);
		l5.next.next.next.next.next = new ListNode(6);
		l5.next.next.next.next.next.next = new ListNode(6);
		
		ListNode l6 = new ListNode(-7);
		
		ListNode l7 = new ListNode(1);
		
		ListNode l8 = new ListNode(2);

		ListNode l9 = new ListNode(-9);
		l9.next = new ListNode(3);
		ListNode l10 = new ListNode(5);
		l10.next = new ListNode(7);
	
		for (ListNode cursor = l9; cursor != null; cursor = cursor.next) {
			System.out.print(cursor.val + " ");
		}

		System.out.println();
		
		for (ListNode cursor = l10; cursor != null; cursor = cursor.next) {
			System.out.print(cursor.val + " ");
		}

		System.out.println();

		Solution retList = new Solution();
		//ListNode ans1 = retList.mergeTwoLists(l1, l2);
		//ListNode ans2 = retList.mergeTwoLists(l3, l4);
	  // ListNode ans3 = retList.mergeTwoLists(l5, l6);
	  // ListNode ans4 = retList.mergeTwoLists(l7, l8);
	   ListNode ans5 = retList.mergeTwoLists(l9, l10);

		//for (ListNode cursor = ans1; cursor != null; cursor = cursor.next) {
			//System.out.print(cursor.val + " ");
		//}
		
		System.out.println();
		
		//for (ListNode cursor = ans2; cursor != null; cursor = cursor.next) {
		//	System.out.print(cursor.val + " ");
		//}
		
		System.out.println();
		
		//for (ListNode cursor = ans3; cursor != null; cursor = cursor.next) {
			//System.out.print(cursor.val + " ");
		//}
		
		System.out.println();

		
		//for (ListNode cursor = ans4; cursor != null; cursor = cursor.next) {
			//System.out.print(cursor.val + " ");
		//}
		
		System.out.println();


		for (ListNode cursor = ans5; cursor != null; cursor = cursor.next) {
			System.out.print(cursor.val + " ");
		}
	}

}
