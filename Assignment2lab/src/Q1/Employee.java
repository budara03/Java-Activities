package Q1;

public class Employee {

	int id;
	String name;
	int hours ;
	
 public Employee () {
	 this.id = 0;
	 this.name = " ";
	 this.hours = 0;
	 
 }
 public Employee (int id,String name,int hours) {
	 this.id = id;
	 this.name = name;
	 this.hours = hours;
 }
 
 public void Display() {
	 System.out.println("id = " +this.id);
	 System.out.println("Name = " +this.name);
	 System.out.println("Hours = " +this.hours);
	 System.out.println();
 }
public int getHours() {
	return hours;
}

 
 
 
}

