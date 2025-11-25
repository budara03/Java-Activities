package EX01;

public class StudentApp {

	public static void main(String[] args) {
		// Creating an array to store 5 Student objects
        Student[] students = new Student[5];

        // Instantiating 5 Student objects
        students[0] = new Student("Alice", "Computer Science", "1234567890");
        students[1] = new Student("Bob", "Mathematics", "0987654321");
        students[2] = new Student("Charlie", "Physics", "1122334455");
        students[3] = new Student("David", "Chemistry", "5566778899");
        students[4] = new Student("Eve", "Biology", "6677889900");

        // Displaying the details of all the students using a for loop
        for (Student student : students) {
            student.print();
        }
    }
}



