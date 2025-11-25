package Q4;

public class Link {

	int ID;
	Link next;
	
	public Link(int IDNo) {
		ID = IDNo;
		next = null;
	}
	public void displaylink() {
		System.out.println(ID);
	}
}
