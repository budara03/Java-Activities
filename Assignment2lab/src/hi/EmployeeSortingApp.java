package hi;
import java.util.PriorityQueue;
class Employee {
	int id;
	String name;
	int hours;
	public Employee() {
	id = 0;
	name ="";
	hours = 0;
	}
	public Employee(int id,String name,int hours) {
		this.id = id;
		this.name =name;
		this.hours =hours;
		}
	public int getHours() {
		return hours;
	}
	
	@Override
	public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Hours: " + hours;
    }

}
public class EmployeeSortingApp {

	public static void main(String[] args) {
		
		PriorityQueue<Employee> employeeQueue = new PriorityQueue<>();
		employeeQueue.add(new Employee(101, "Alice", 20));
        employeeQueue.add(new Employee(102, "Bob", 12));
        employeeQueue.add(new Employee(103, "Charlie", 25));
        employeeQueue.add(new Employee(104, "David", 10));
        employeeQueue.add(new Employee(105, "Eve", 18));
        

		 
		 System.out.println("Default PriorityQueue");
		 System.out.println();
		 
		 while (!employeeQueue.isEmpty()) {
	            Employee emp = employeeQueue.poll();
	            System.out.println(emp);
	        }
		    employeeQueue.add(new Employee(101, "Alice", 20));
	        employeeQueue.add(new Employee(102, "Bob", 12));
	        employeeQueue.add(new Employee(103, "Charlie", 25));
	        employeeQueue.add(new Employee(104, "David", 10));
	        employeeQueue.add(new Employee(105, "Eve", 18));
	        
	        PriorityQueue<Employee> AfteremployeeQueue = new PriorityQueue<>();
	        
	        
	        while (!employeeQueue.isEmpty()) {
	            Employee emp = employeeQueue.poll();
	            if(emp.hours>15) {
	            	AfteremployeeQueue.add(emp);
	            	 System.out.println(emp);
	            }
	            while (!AfteremployeeQueue.isEmpty()) {
		            Employee emp2 = employeeQueue.poll();
		            System.out.println(emp2);
		        }
	         
	        }
	        
	

	
}
}
