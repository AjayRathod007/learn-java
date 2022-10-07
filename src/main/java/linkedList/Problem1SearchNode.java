package linkedList;


public class Problem1SearchNode {
	Node head;
	private int size;
	Problem1SearchNode(){
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
	
	public int getSize() {
		return size;
	}
	
	public int searchIndex() {
		
		
 
		int count =0;
		int x =0; 
		Node currNode = head;
		
		while(currNode !=null ) {
			if(currNode.data == x) {
				return count ;
			}
			
			currNode=currNode.next;
			count++;
			
		}
		
		return -1;
		
		
	}
		
	public static void main(String[] args) {
		
		Problem1SearchNode list = new Problem1SearchNode();
		list.addElement(1);
		list.addElement(5);
		list.addElement(7);
		list.addElement(8);
		list.addElement(2);
		list.addElement(3);
		list.addElement(9);
		
		list.printList();
		int x = list.searchIndex();
		
		System.out.println(x +" " +list.getSize());
		
		
	}

}
