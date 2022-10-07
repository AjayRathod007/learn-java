package linkedList;


public class BasicLinkedList2 {

	int data;
	BasicLinkedList2 next;
	BasicLinkedList2(int data){
		this.data = data;
		//this.next = null;
	}
	

public static void main(String[] args) {
	BasicLinkedList2 n1 = new BasicLinkedList2(10);
	BasicLinkedList2 n2 = new BasicLinkedList2(20);
	BasicLinkedList2 n3 = new BasicLinkedList2(30);
	
	BasicLinkedList2 head = n1;
	head.next = n2;
	n2.next = n3;
	printTraverse(head);
	insert(25,head,2);
	printTraverse(head);
	delete(head,2);
	printTraverse(head);
	head = reverse(head);
	printTraverse(head);
}

// print
public static void printTraverse(BasicLinkedList2 head) {
	
	BasicLinkedList2 currNode = head;
	while(currNode != null) {
		System.out.print(currNode.data+"->");
		currNode = currNode.next; 
	}
	System.out.println("NULL");
	
}

// add

public static void insert(int data,BasicLinkedList2 head,int pos) {
	BasicLinkedList2 toAdd = new BasicLinkedList2(data);
	if(pos == 0) {
		toAdd.next = head;
		head = toAdd;
		return;
	}
	
	BasicLinkedList2 prev = head;
	
	for(int i=0;i<pos-1;i++) {
		prev = prev.next;
	}
	
	toAdd.next = prev.next;
	prev.next = toAdd;
}

// delete
public static void delete(BasicLinkedList2 head,int pos) {
	if(pos ==0) {
		head = head.next;
		return;
	}
	
	BasicLinkedList2 prev = head;
	for(int i=0;i<pos-1;i++) {
		prev = prev.next;
	}
	
	prev.next = prev.next.next;
}

// reverse
public static BasicLinkedList2 reverse(BasicLinkedList2 head) {
	BasicLinkedList2 curr = head;
	BasicLinkedList2 prev = null;
	while(curr != null) {
		BasicLinkedList2 temp = curr.next;
		curr.next = prev;
		prev = curr;
		curr = temp;
	}
	head = prev;
	return head;
}

}
