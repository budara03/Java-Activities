package Q4;

public class LinkList {
	Link first;
	
	public LinkList() {
		first = null;
	}
	public boolean isEmpty() {
		return(first==null); 
	}
	
	public void addfirst(int ID) {
		Link L1 = new Link (ID);
	    L1.next = first;
		first = L1;
	}
	public int removefirst() {
		  Link Current = first; 
			first = Current.next;
			return Current.ID;
	    
	}
	public void deleteAllLinks() {
	 Link Current = first;
	 while(Current!=null) {
		int Id = removefirst();
		System.out.println("Deleted ID :"+Id);
	 }
	 System.out.println("ALL ARE deleted .");
	}

}
