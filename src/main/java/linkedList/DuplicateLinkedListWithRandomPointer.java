package linkedList;

public class DuplicateLinkedListWithRandomPointer {
	class Node{
		int data;
		Node next;
		Node randomNext;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.randomNext = null;
		}
	}
	
	
	public Node duplicate(Node head) {
		Node curr = head;
		
		//inserting newNodes in between
		
		while(curr != null) {
			Node temp = curr.next;
			curr.next = new Node(curr.data);
			curr.next.next = temp;
			curr = temp;
			
		}
		
		curr = head;
		
		// setting  Random pointers of newNodes
		
		while(curr != null) {
			if(curr.next != null ) {
				curr.next.randomNext = (curr.randomNext != null)?curr.randomNext.next:null;
			}
			
			curr= curr.next.next;
			
		}
		
		// separating both the linkedList
		
		Node originalList = head;
		Node copyList = head.next;
		Node temp = copyList;
		
		while(originalList != null) {
			originalList.next = originalList.next.next;
			temp.next = temp.next.next;
			originalList = originalList.next;
			temp = temp.next;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
	}

}
