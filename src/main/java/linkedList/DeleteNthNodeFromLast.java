package linkedList;

import java.util.Scanner;

public class DeleteNthNodeFromLast {
	Node head;
	DeleteNthNodeFromLast next;
	private int size;
	
	DeleteNthNodeFromLast(){
		this.size = 0;
	}
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
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
			System.out.println("list is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+"->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	public DeleteNthNodeFromLast removeNthFromEnd(DeleteNthNodeFromLast head) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth node");
		int n = sc.nextInt();
		if(head.next == null) {
			return null;
		}
		
		int size =0;
		
		DeleteNthNodeFromLast currNode = head;
		while(currNode != null) {
			size++;
			currNode = currNode.next;
		}
		
		if(n == size) {
			return head.next;
		}
		
		int indexToSearch = size - n;
		DeleteNthNodeFromLast prev = head;
		int i=1;
		while(i<indexToSearch) {
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return head;
	}
	public static void main(String[] args) {
		DeleteNthNodeFromLast list = new DeleteNthNodeFromLast();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.printList();
		
	
	}


}
