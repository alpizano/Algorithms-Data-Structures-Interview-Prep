
class Solution {
	
   // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //return ListNode;   
   // }
    
    public static void main(String[] args) {
    	// 2 -> 4 -> 3
    	// 5 -> 6 -> 4
    	
    	ListNode l1 = new ListNode(2,null);
    	ListNode l2 = new ListNode(5,null);
    	
    	ListNode selection;
    	selection = l1;
    	l1.addNodeAfter(4);
     	
    	selection = l1.getLink();
    	selection.addNodeAfter(3);
    	
    	ListNode selection2;
    	selection2 = l2;
    	l2.addNodeAfter(6);
    	
    	selection2 = l2.getLink();
    	l2.addNodeAfter(4);
    	
    	
    	System.out.println("l1:");
    	ListNode cursor;
    	for(cursor = l1; cursor != null ; cursor = cursor.getLink()) {
    		System.out.print(cursor.getData() + " -> ");
    	}
    	System.out.println();
    	System.out.println();
    	
    	System.out.println("l2:");
    	ListNode cursor2;
    	for(cursor2 = l2; cursor2 != null ; cursor2 = cursor2.getLink()) {
    		System.out.print(cursor2.getData() + " -> ");
    	}
    }
}