package linkedList;


public class ReverseLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next = null;
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
			
		}
		
		currNode.next = newNode;
	}
	
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
	
	//reverse linked list
	
	public void reverseLinkedList() {
		if(head == null || head.next == null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		
		head.next = null;
		head = prevNode;
	}
	
	
	public Node reverseListRecursive(Node head) {
	       //empty node || last node or only one node
	       if(head == null || head.next == null) {
	           return head;
	       }
	 
	       Node newHead = reverseListRecursive(head.next);
	      
	       head.next.next = head;
	       head.next = null;
	       return newHead;
	   }
	public static void main(String[] args) {
		
		ReverseLinkedList list = new ReverseLinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.printList();
		
		list.reverseLinkedList();
		list.printList();
		
		list.head = list.reverseListRecursive(list.head);
		list.printList();
		
	}

}
