package linkedList;

public class CircularSinglyLinkedList {
	private ListNode last;
	private int size;
	class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			
		}
		
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(30);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	public void printList() {
		if(last == null) {
			System.out.println("List is empty");
			return;
		}
		
		ListNode first = last.next;
		while(first != last) {
			System.out.print(first.data+"-->");
			first = first.next;
		}
		System.out.println(first.data+" ");
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(last == null) {
			last = newNode;
		}
		else {
			newNode.next = last.next;
		}
		last.next = newNode;
		size++;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(last == null) {
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		
	}
	
	//public void delete
	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		
		csll.createCircularLinkedList();
		csll.printList();
		csll.insertFirst(90);
		csll.printList();
		csll.insertLast(50);
		csll.printList();
		
	}
	
	

}
