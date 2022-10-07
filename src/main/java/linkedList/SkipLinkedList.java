package linkedList;

import java.util.HashSet;

public class SkipLinkedList {
	Node head;
	
	 class Node{
		int data;
		Node next;
		Node skipNext;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.skipNext = null;
		}
	}
	
	public void addElement(int data) {
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
		
		Node curr =head;
		while(curr != null) {
			
			System.out.print(curr.data+"->"+"|");
			
			if(curr.skipNext!=null) {
				System.out.print(curr.skipNext.data);
			}
			else {
				System.out.print("NULL");
			}
			curr = curr.next;
		}
		System.out.println("NULL");
	}
	
	public void reverseSkipNode(Node head) {
		
HashSet<Node> s= new HashSet<>(); 
		
		Node temp = head;
		while(temp != null) {
			if(temp.skipNext!= null && (!s.contains(temp) && !s.contains(temp.skipNext))) {
				
			s.add(temp);
			s.add(temp.skipNext);
				
			temp.skipNext.skipNext = temp;
			temp.skipNext = null;
			}
			temp = temp.next;
		}
	}
	
	public  void reverseNode(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		this.head = prev;
		
	}
	
	public static void main(String[] args) {
		SkipLinkedList list = new SkipLinkedList();
		Node n1 = list.new Node(1);
		Node n2 = list.new Node(2);
		Node n3 = list.new Node(3);
		Node n4 = list.new Node(4);
		Node n5 = list.new Node(5);
		Node n6 = list.new Node(6);
		Node n7 = list.new Node(7);
		Node n8 = list.new Node(8);
		Node n9 = list.new Node(9);
		Node n10 = list.new Node(10);
		
		list.head= n1;
		n1.next = n2;
		n1.skipNext=n5;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n6.skipNext=n10;
		n7.next=n8;
		n8.next=n9;
		n9.next=n10;
		n10.next=null;
		
		list.printList();
		
		list.reverseSkipNode(list.head);
		list.reverseNode(list.head);
		list.printList();
		
	}

}
