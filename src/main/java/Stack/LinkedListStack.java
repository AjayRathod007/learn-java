package Stack;



public class LinkedListStack {
	static Node head;
	 static int size;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	
	public LinkedListStack() {
		head = null;
		size = 0;
		
	}
	
	
	public static void push(int data) {
		Node newNode =  new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public static int peek() throws Exception {
		if(head == null) {
			throw new Exception();
		}
		
		return head.data;
	}
	
	public static int pop() throws Exception {
		if(head == null) {
			throw new Exception();
			
		}
		
		int res = head.data;
		head = head.next;
		size--;
		return res;
		
	}
	
	public static boolean isEmpty() {
		return head == null;
	}
	
	public static int size() {
		return size;
	}
	
	public static void main(String[] args) throws Exception {
		LinkedListStack s = new LinkedListStack();
		s.push(1);
		s.push(2);
		System.out.println(s.pop());
		System.out.println(s.pop());
		
//		while(!s.isEmpty()) {
//			System.out.println(s.peek());
//			s.pop();
//		}
	}
	


}
