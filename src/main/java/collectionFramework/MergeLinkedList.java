package collectionFramework;


class SinglyLinkedListNode{
	int data;
	SinglyLinkedListNode next;
	
	SinglyLinkedListNode(int data){
		this.data=data;
		this.next = null;
	}
}

public class MergeLinkedList {
	SinglyLinkedListNode head;

	
	public void addElement(int data) {
		SinglyLinkedListNode curr = new SinglyLinkedListNode(data);
		if(head == null) {
			head = curr;
			return;
		}
		
		SinglyLinkedListNode currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
			
		}
		
		currNode.next = curr;

	}
	
	
	
	public static void main(String[] args) {
		MergeLinkedList list1 = new MergeLinkedList();
		MergeLinkedList list2 = new MergeLinkedList();
		list1.addElement(1);
		list1.addElement(3);
		list1.addElement(5);
		list2.addElement(2);
		list2.addElement(4);
		list2.addElement(6);
		
		SinglyLinkedListNode newHead = merge(list1.head,list2.head);
			list1.printList(newHead);
		
		
	}
		
		private void printList(SinglyLinkedListNode newHead) {
		// TODO Auto-generated method stub
			if(newHead == null) {
				System.out.println("List is empty");
			}
			
			SinglyLinkedListNode curr = newHead;
			
			while(curr != null) {
				System.out.print(curr.data+"->");
				curr = curr.next;
			}
			
			System.out.println("null");
		
	}



		public static SinglyLinkedListNode merge(SinglyLinkedListNode head1,SinglyLinkedListNode head2) {
		
	 SinglyLinkedListNode head3=null;
     SinglyLinkedListNode temp1 = head1;
     SinglyLinkedListNode temp2 = head2;
     
     
     while(temp1 !=null && temp2 != null){
         if(temp1.data == temp2.data){
             if(head3 == null){
            	 
             SinglyLinkedListNode newNode = new SinglyLinkedListNode(temp1.data);
             head3=newNode;
             SinglyLinkedListNode Node = new SinglyLinkedListNode(temp2.data);
             head3.next=Node;
             temp1 = temp1.next;
             temp2 = temp2.next;
             }else{
                 SinglyLinkedListNode newNode = new SinglyLinkedListNode (temp1.data);
                 SinglyLinkedListNode Node = new SinglyLinkedListNode(temp2.data);
                 SinglyLinkedListNode temp4 = head3;
                 while(temp4.next != null){
                     temp4 = temp4.next;
                 }
                 temp4.next=newNode;
                 temp4 = temp4.next;
                 temp4.next=Node;
                 temp1 = temp1.next;
                 temp2 = temp2.next;
             }
             
         }else if(temp1.data<temp2.data){
             if(head3 == null){
                 SinglyLinkedListNode newNode = new SinglyLinkedListNode(temp1.data);
                 
                 head3 = newNode;
                 temp1 = temp1.next;
     
             }
             else{
                 SinglyLinkedListNode newNode = new SinglyLinkedListNode(temp1.data);
                 SinglyLinkedListNode temp4 = head3;
                 while(temp4.next != null){
                     temp4 = temp4.next;
                 }
                 temp4.next = newNode;
                 temp1 = temp1.next;
 
             }
         }else{
             if(head3 == null){
                 SinglyLinkedListNode newNode = new SinglyLinkedListNode(temp2.data);
                 
                 head3 = newNode;
                 temp2 = temp2.next;
                 
             }else {
             
             SinglyLinkedListNode Node = new SinglyLinkedListNode(temp2.data);
                 SinglyLinkedListNode temp4 = head3;
                 while(temp4.next != null){
                     temp4 = temp4.next;
                 }
             
             temp4.next = Node;
             
             temp2 = temp2.next;
             }
         }
         
         
     }
     
     if(temp1==null&&temp2!=null){
         SinglyLinkedListNode temp4 = head3;
                 while(temp4.next != null){
                     temp4 = temp4.next;
                 }
                 temp4.next=temp2;
     }else if(temp1 != null && temp2 == null){
         SinglyLinkedListNode temp4 = head3;
                 while(temp4.next != null){
                     temp4 = temp4.next;
                 }
                 temp4.next=temp1;
     }
     return head3;
	}

}
