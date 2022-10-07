package linkedList;


public class BasicLinkedList {
	Node head;
	private int size;
	
	BasicLinkedList(){
		this.size = 0;
	}
	
	class Node{
		String data;
	    Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//add-first
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head = newNode;
		
	}
	
	//add-last
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next=newNode;
		
	}
	// print
	
	
	public void printList() {
		if(head == null) {
			System.out.println("LIst is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+"->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	// delete - first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		size--;
		
		head = head.next;
		
	}
	
	// delete - last
	public void deleteLast() {
		if(head == null) {
			System.out.println("LIst is empty");
			return;
		}
		
		size--;
		//only one node in linkedList then cornerCase
		if(head.next == null) {
			head = null;
			return;
			
		}
		
		Node secondLast = head;
		Node lastNode = head.next;//head.next = null -> lastNode = null
		while(lastNode.next != null) {// null.next
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			
		}
		
		secondLast.next = null;
		
	}
	
	public int getSize() {
		return size;
	}
	public static void main(String args[]) {
		BasicLinkedList list = new BasicLinkedList();
		list.addFirst("fsd");
		list.addFirst("is");
		list.printList();
		list.addLast("list");
		list.printList();
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		
		System.out.println(list.getSize());
		
	}


}
