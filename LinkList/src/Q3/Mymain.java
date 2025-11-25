package Q3;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		
		Scanner s1 =  new Scanner(System.in);
        LinkList ll  = new LinkList();
        
        for(int i = 0 ;i<5;i++) {
        	System.out.println("Enter Number "+(i+1)+" :");
        	ll.FirstInsert(s1.nextInt());
        }
        
         System.out.println("Enter the key :");
         int key= s1.nextInt();
         System.out.println("Enter the data :");
         int data= s1.nextInt();
         
        if( ll.insertAfter(key, data)) {
        	System.out.println("Insert Key "+key +"and Data" +data + " Sucessfully !" );
        }else {
        	System.out.println("InsertAfter is failed !");
        }
         
  
        	ll.displayList();
       
        
       ll.delete(20);
      
       	ll.displayList();
      
       
	}

}
