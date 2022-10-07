package linkedList;


public class PalindromeLinkedList {
	Node head;
	class Node{
		char data;
		Node next;
		
		Node(char data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void addLast(char data) {
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
	
	
	public boolean isPalindrome(Node head) {
		
		if(head == null) {
			return true;
		}
		
		Node mid = middle(head);
		Node last = reverse(mid.next);
		
		Node curr = head;
		while(last != null) {
			if(last.data != curr.data) {
				return false;
			}
			
			last = last.next;
			curr = curr.next;
		}
		return true;
	}

	private Node reverse(Node next) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node curr = next;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev  = curr;
			curr = temp;
		}
		head = prev;
		return prev;
	}

	private Node middle(Node head2) {
		// TODO Auto-generated method stub
		Node slow = head2;
		Node fast = head2;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static void main(String[] args) {
		PalindromeLinkedList list = new PalindromeLinkedList();
		list.addLast('a');
		list.addLast('b');
		list.addLast('c');
		list.addLast('b');
		list.addLast('a');
		list.printList();
		boolean flag = list.isPalindrome(list.head);
		System.out.println(flag);
	}

}
