package Q6;

public class DoublyLinkedList {
	List head;
	
	public DoublyLinkedList() {
		head = null;
	}
	
	public void InsertFirst(int data) {
		
		List l1 = new List(data);
		l1.next = head;
		if(head != null) {
			
			head.Prev =l1;
		}
		head = l1;
	}
	public void DeleteFirst() {
		if(head == null) {
			return;
		}
		List temp = head;
		head = head.next;
		if(head!=null) {
			head.Prev=null;
			
		}
		temp.next = null;
	}
	// Delete a specific node
	public void deleteNode(List P0) {
		if(P0==null)
			return ;
		
		if(P0.Prev !=null) {
			P0.Prev.next=P0.next;
		}else
			head = P0.next;
		if(P0.next!=null) {
			P0.next.Prev=P0.Prev;
		}
		P0.next=null;
		P0.Prev=null;
	}
	//Display all nodes 
	public void displayList() {
		List current = head;
		while(current!=null) {
			current.display();
			current=current.next;
		}
	}
	// Find a node by value (for demo purposes)
    public List find(int key) {
        List current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        return current;
    }

}
