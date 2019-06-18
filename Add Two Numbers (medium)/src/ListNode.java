public class ListNode {
	private int data;
	private ListNode link;
	 
public ListNode(int data) { 
	 ListNode head;
	 head = new ListNode(data, null);
	}

public ListNode(int initialData, ListNode initialLink) {
	this.data = initialData;
	this.link = initialLink;
}

public void addNode(int val, ListNode head) {
	head = new ListNode(val,head);
}

public int getData() {
	return data;
}

public ListNode getLink() {
	return link;
}

public void setData(int val) {
	this.data = data;
}

public void setLink(ListNode newLink) {
	this.link = newLink;
}

//public void addNode(ListNode head) {
	//head = new ListNode(data, head);
//}

public void addNodeAfter(int element) {
	link = new ListNode(element, link);
}

}
