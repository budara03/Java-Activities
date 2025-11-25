package Q3;

public class LinkList {
	
  public Link first;
  
  public LinkList() {
	  first=null;
  }
  
  public boolean isEmpty() {
	  if(first==null) {
		  return true;
	  }else 
		  return false;
  }
  
  public void displayList() {
	  Link current = first;
	 while(current!=null) {
		 current.displayLink();
		 current=current.next;
	 }
	 System.out.println("");
  }
  public Link find(int key) {
	  Link current = first;
	  while(current!=null) {
		  if(current.iData==key) {
			  return current;
		  }
		  else {
			  current= current.next;
		  }
	  }
	  return null;
  }
  public boolean delete(int key) {
	  Link previous = first;
	  Link current = first;
	  
	  while(current!=null) {
		  
		  if(current.iData==key) {
			  previous.next=current.next;
			  return true;
		  }else {
			  previous=current;
			  current=current.next;
		  }
		  
		  
	  }
	  return false;
  }
  
  public boolean insertAfter(int key, int newData) {
	  Link current = first ;
	  while(current!=null) {
		  if(current.iData==key) {
			  Link  link  = new Link(newData);
			  link.next=current.next;
			  current.next =link;
			  return true;
		  }else {
			  current = current.next;
		  }
	  }
	  return false;
	  
  }
  public void FirstInsert(int key) {
	  Link l1 =new Link(key);
	  l1.next=first;
	  first=l1;
	  
  }
}
