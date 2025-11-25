package Q1;
import java.util.ArrayList;

public class EmployeeSortingApp {

	public static void main(String[] args) { 
		
		Employee e1 = new Employee (101,"Harry",2);
		Employee e2 = new Employee (102,"Louis",3);
		Employee e3 = new Employee (103,"Liam",45);
		Employee e4 = new Employee (104,"Nial",4);
		Employee e5 = new Employee (105,"Zayn",76);
      
		Employee[] priorityQueue = { e1,e2,e3,e4,e5};
		ArrayList<Employee> NewPriorityQueue = new ArrayList<Employee>();
		
		System.out.println("Default");
		System.out.println("------------");
		
		for (int i=0;i< priorityQueue.length;i++) {
			priorityQueue[i].Display();
			if(priorityQueue[i].getHours()>15) {
				NewPriorityQueue.add(priorityQueue[i]);
			}
		}
		System.out.println("New");
		System.out.println("------------");
		
		for(int i=0 ;i < NewPriorityQueue.size();i++) {
			NewPriorityQueue.get(i).Display();
		}
	}

}
