package EX01;

public class Student {
	private static int max = 100; // Static property for generating unique student IDs
    private int studentID;
    private String name;
    private String degree;
    private String mobile;

    // Constructor to initialize name, degree, and mobile. Student ID is auto-generated.
    public Student(String name, String degree, String mobile) {
        this.studentID = max++; // Assign and increment max for next student
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
    }

    // Getter and Setter methods for name, degree, and mobile
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Method to print details of a student
    public void print() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Degree: " + degree);
        System.out.println("Mobile: " + mobile);
        System.out.println();
    }

    // Static method to get the next student ID
    public static int getNextStudentID() {
        return max;
    }
}
