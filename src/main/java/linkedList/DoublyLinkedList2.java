package linkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList2 {
	private ListNode  head;
	private ListNode tail;
	private int size;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode prev;
		
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public DoublyLinkedList2() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	public int size() {
		return size;
		
	}
	
	public ListNode deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		if(head == tail) {
			tail = null;
		}else {
			head.next.prev = null;
		}
		
		head = head.next;
		 temp.next = null;
		size--;
		return temp;
	}
	
	public ListNode deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		}
		ListNode temp = tail;
		if(head == tail) {
			tail = null;
		}else {
			tail.prev.next = null;
		}
		
		tail = tail.prev;
		 temp.prev = null;
		size--;
		return temp;

		
		
		
	}
	
	public void insertBegining(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		}else {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail = newNode;
		size++;
	}
	
	public void displayForward() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		ListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		if(tail==null) {
			System.out.println("list is empty");
			return;
		}
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.prev;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList2 dll = new DoublyLinkedList2();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		dll.insertBegining(8);
		dll.insertBegining(9);
		
		
		dll.displayForward();
		dll.displayBackward();
		
		dll.deleteFirst();
		dll.displayForward();
		dll.deleteLast();
		dll.displayForward();
		
		
	}

}
