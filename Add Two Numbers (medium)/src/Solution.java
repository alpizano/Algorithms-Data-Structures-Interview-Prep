
class Solution {
	
   // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //return ListNode;   
   // }
    
    public static void main(String[] args) {
    	// 2 -> 4 -> 3
    	// 5 -> 6 -> 4
    	
    	ListNode l1 = new ListNode(2,null);
    	ListNode l2 = new ListNode(5,null);
    	ListNode l3 = new ListNode(69,null);
    	
    	// Adding to the head of the Linked List
    	ListNode test1 = null;
    	test1 = new ListNode(25,test1);
    	test1 = new ListNode(33,test1);
    	test1 = new ListNode(45,test1);
    	
    	
    	//ListNode testChain = new ListNode(33,(55, null) , (77, null)
    	

    	l3.addNode(45,l3);
    	
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
    	
    	System.out.println();
    	System.out.println();
    	
    	System.out.println("l3:");
    	ListNode cursor3;
    	for(cursor3 = l3; cursor3 != null ; cursor3 = cursor3.getLink()) {
    		System.out.print(cursor3.getData() + " -> ");
    	}
    	
    	System.out.println();
    	System.out.println();
    	
    	System.out.println("test1:");
    	ListNode cursor4;
    	for(cursor4 = test1; cursor4 != null ; cursor4 = cursor4.getLink()) {
    		System.out.print(cursor4.getData() + " -> ");
    	}
    	
    	
    	System.out.println("Adding:");
    	
    	ListNode cursorAdd1;
    	ListNode cursorAdd2 = l2;
    	for(cursorAdd1 = l1; cursorAdd1 != null ; cursorAdd1 = cursorAdd1.getLink()) {
    		
    		System.out.print(cursorAdd1.getData() + cursorAdd2.getData());
    		cursorAdd2 = cursorAdd2.getLink();
    		}
    }
}