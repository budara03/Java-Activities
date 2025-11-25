package hi;
import java.util.ArrayList;

public class StudentSortingApp {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(12,"poll",45));
		students.add(new Student(13,"pll",60));
		students.add(new Student(14,"pol",55));
		students.add(new Student(15,"oll",40));
		students.add(new Student(16,"ll",50));
		
		System.out.println("All students:");
		for(Student S1 :students) {
			System.out.println(S1);
	
		}
		
		for(int i=0 ;i < students.size();i++) {
			if(students.get(i).getMark() > 50) {
                students.remove(i);
                i--;
		} 
			
		}
			System.out.println("\nUpdated list after removing students with marks > 50:");
	
           for(Student S1 :students) {
        	   System.out.println(S1);
	
			}
	}

	}

