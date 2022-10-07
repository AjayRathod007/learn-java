package linkedList;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class DetectCycleInLinkedList {
	 Node head;
	 
	
	public void addElement(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = newNode; 
	}
	
	public void printList() {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node curr = head;
		
		while(curr != null ) {
			
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		//System.out.println("null");
	}
	
	
	public Node  removeNode(Node head) {
		Node meet = detectCycle(head);
		Node start = head;
		Node prev = null;
		while( start != meet) {
			start = start.next;
			prev = meet;
			meet = meet.next;
		}
		prev.next = null;
		return head;
		
	}
	
	
	
	public Node detectFirstNode(Node head) {
		Node meet = detectCycle(head);
		Node start = head;
		
		
		while(start != meet) {
			start = start.next;
			meet = meet.next;
		}
		
		return start;
	}
	
	public static Node detectCycle(Node head) {
		Node slow =head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}
	
	public static int detectCycleCount(Node head) {
		Node slow =head;
		Node fast = head;
		int c=0;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			c++;
			fast = fast.next.next;
			if(slow == fast) {
				return c;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		DetectCycleInLinkedList list = new DetectCycleInLinkedList();
		
		list.head = new Node(50);
		list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        
        
        
        // creating loop
        list.head.next.next.next.next.next = list.head.next.next;
        
        int c = detectCycleCount(list.head);
		System.out.println(c);
		//list.printList();
	
	}

}
