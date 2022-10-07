package linkedList;


class DoublyNode{
	int data;
	DoublyNode next;
	DoublyNode prev;
	
	public DoublyNode(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {

	public static void printList(DoublyNode head) {
	if(head == null) {
	System.out.println("list is Empty");
		}
		
	DoublyNode curr = head;
	
	System.out.print("NULL <-- "+curr.data+" -->");
	curr=curr.next;
		while(curr != null) {
			
			System.out.print("<-- "+curr.data+" -->");
			curr = curr.next;                            
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DoublyNode head=null;
		
		DoublyNode  n1 = new DoublyNode(10);
		DoublyNode n2 = new DoublyNode(20);
		DoublyNode n3 = new DoublyNode(20);
		DoublyNode n4 = new DoublyNode(20);
		
		
		head=n1;
		n1.next=n2;
		n2.next = n3;
		n2.prev = n1;
		n3.next=n4;
		n3.prev=n2;
		n4.next=null;
		n4.prev=n3;
		
		printList(head);
		
		
		
	}

}
