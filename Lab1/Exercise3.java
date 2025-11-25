import java.util.Scanner;

public class Exercise3  {
    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the age
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();
        
        // Check if the age is greater than 18
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }