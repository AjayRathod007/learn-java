package linkedList;

import java.util.Scanner;


public class Problem2RemoveNthNode {
	private Node head;
	private int size;
	private Node curr;   // TO POINT LAST NODE OF LIST, IT WILL HELP WHILE ADDING NODE.  
	
	Problem2RemoveNthNode(){
		this.size=0;
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
	
	public void addElement(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			curr=head;
		}
		
		curr.next=newNode;
		curr=curr.next;
	}
	
	public void print() {
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
	
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth node");
		int n = sc.nextInt();
		int count = 0;
		Node currNode = head;
		
		while(currNode != null && count <(size - n-1)) {

			
			currNode = currNode.next;
			count++;
		}
		
		
		if(currNode!=null)
		{
	     	currNode.next = currNode.next.next;
		}
		
	}
	
	//1  1  2  2  3  3  4 -> null
	public static void main(String[] args) {
		Problem2RemoveNthNode list = new Problem2RemoveNthNode();
		list.addElement(1);
		list.addElement(2);
		list.addElement(2);
		list.addElement(4);
		list.addElement(2);
		list.addElement(3);
		list.remove();
		list.print();
		
	}


}
